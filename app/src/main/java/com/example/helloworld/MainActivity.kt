package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent = Intent(this,BMICalculattorActivity::class.java)
            startActivity(intent)

        }
        btnMoney = findViewById(R.id.btnMoney)
        btnMoney.setOnClickListener {
            val intent = Intent(this,sendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}