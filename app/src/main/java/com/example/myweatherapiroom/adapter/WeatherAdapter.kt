package com.example.myweatherapiroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myweatherapiroom.data.entity.Weather
import com.example.myweatherapiroom.R;

class WeatherAdapter(var list: List<Weather>) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    private lateinit var dialog: Dialog

    fun setDialog(dialog: Dialog) {
        this.dialog = dialog
    }

    interface Dialog {
        fun onClick(position: Int)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cityFullName: TextView
        var cityTemperature: TextView
        var cityWindySpeed: TextView
        var cityPressure: TextView
        var cityHumidity: TextView
        var time: TextView

        init {
            cityFullName = view.findViewById(R.id.city_full_name)
            cityTemperature = view.findViewById(R.id.city_temperature)
            cityWindySpeed = view.findViewById(R.id.city_windy_speed)
            cityPressure = view.findViewById(R.id.city_pressure)
            cityHumidity = view.findViewById(R.id.city_humidity)
            time = view.findViewById(R.id.time)
            view.setOnClickListener {
                dialog.onClick(layoutPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_weather, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cityFullName.text = list[position].cityName
        holder.cityTemperature.text = list[position].temp
        holder.cityWindySpeed.text = list[position].windySpeed
        holder.cityPressure.text = list[position].pressure
        holder.cityHumidity.text = list[position].humidity
        holder.time.text = list[position].time
    }
}