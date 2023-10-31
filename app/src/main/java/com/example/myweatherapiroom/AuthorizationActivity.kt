package com.example.myweatherapiroom

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.EditText
import android.widget.Toast
import com.example.myweatherapiroom.databinding.ActivityAuthorizationBinding

class AuthorizationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthorizationBinding
    private lateinit var shPref: SharedPreferences
    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthorizationBinding.inflate(layoutInflater)
        setContentView(binding.root)



        username = binding.editTextTextPersonName
        password = binding.editTextTextPassword

        shPref = getPreferences(MODE_PRIVATE)
        username.setText(shPref.getString("username", ""))
        password.setText(shPref.getString("password", ""))

        binding.buttonSignIn2.setOnClickListener {

            if (username.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                if (binding.checkbox.isChecked) {
                    val ed = shPref.edit()
                    ed.putString("username", username.text.toString())
                    ed.putString("password", password.text.toString())
                    ed.apply()
                }
                startActivity(
                    Intent(
                        this@AuthorizationActivity,
                        WeatherForecastActivity::class.java
                    )
                )
                finish()
            } else {
                Toast.makeText(this, R.string.emptyfield, Toast.LENGTH_SHORT).show()
            }
        }
    }
}