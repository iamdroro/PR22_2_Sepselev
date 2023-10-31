package com.example.myweatherapiroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.myweatherapiroom.data.AppDatabase
import com.example.myweatherapiroom.data.entity.Weather
import com.example.myweatherapiroom.databinding.ActivityWeatherForecastBinding
import org.json.JSONObject
import java.text.DecimalFormat
import java.util.Calendar

class WeatherForecastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeatherForecastBinding
    private lateinit var tvTemp: TextView
    private lateinit var tvPressure: TextView
    private lateinit var tvWindySpeed: TextView
    private lateinit var tvHumidity: TextView
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherForecastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvTemp = binding.textViewTemp
        tvWindySpeed = binding.textViewWindySpeed
        tvPressure = binding.textViewPressure
        tvHumidity = binding.textViewHumidity
        database = AppDatabase.getInstance(applicationContext)

        binding.buttonWeather.setOnClickListener() {

            if (binding.editTextCity.text.toString().isNotEmpty()) {
                getWeather(binding.editTextCity.text.toString())

                if (!tvTemp.text.toString().isNullOrEmpty()) {
                    binding.textViewNow.visibility = VISIBLE
                    binding.gridlayout.visibility = VISIBLE
                    binding.buttonSave.visibility = VISIBLE
                } else {
                    binding.textViewNow.visibility = GONE
                    binding.gridlayout.visibility = GONE
                    binding.buttonSave.visibility = GONE
                    Toast.makeText(this, R.string.notfound, Toast.LENGTH_SHORT).show()
                }
            } else {
                binding.textViewNow.visibility = GONE
                binding.gridlayout.visibility = GONE
                binding.buttonSave.visibility = GONE
                Toast.makeText(this, R.string.emptyfield, Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonSave.setOnClickListener {

            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH) + 1
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)

            database.weatherDao().insertAll(
                Weather(
                    null,
                    binding.editTextCity.text.toString(),
                    tvTemp.text.toString(),
                    tvWindySpeed.text.toString(),
                    tvPressure.text.toString(),
                    tvHumidity.text.toString(),
                    "$year-$month-$day $hour:$minute"

                )
            )
            binding.textViewNow.visibility = GONE
            binding.gridlayout.visibility = GONE
            binding.buttonSave.visibility = GONE
            startActivity(Intent(this@WeatherForecastActivity, MainActivity::class.java))
        }

    }

    fun getWeather(city: String) {
        var city = binding.editTextCity.text.toString()
        var key = "6c8d96e50f7c4a1197165537230610"
        var url = "https://api.weatherapi.com/v1/current.json?key=$key&q=$city&aqi=no"
        val queue = Volley.newRequestQueue(this)
        val stringR = StringRequest(
            Request.Method.GET,
            url,
            { response ->
                val obj = JSONObject(response)
                var d = DecimalFormat("#")

                val temp = d.format(obj.getJSONObject("current").getDouble("temp_c")).toString()
                tvTemp.text = temp

                d = DecimalFormat("#.#")
                val speed = obj.getJSONObject("current").getDouble("wind_mph")
                val windy = speed * 1.61
                tvWindySpeed.text = d.format(windy).toString()

                d = DecimalFormat("#")
                val pressure =
                    d.format(obj.getJSONObject("current").getDouble("pressure_mb")).toString()
                tvPressure.text = pressure

                val humidity = obj.getJSONObject("current").getString("humidity").toString()
                tvHumidity.text = humidity
            },
            {
                Log.d("MyLog", "Volley error:$it")
            }
        )
        queue.add(stringR)
    }

}