package com.example.kvizandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplicationtest.R
import com.example.myapplicationtest.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val buttonExit = findViewById<Button>(R.id.button2)
        val buttonStart = findViewById<Button>(R.id.button)

        buttonExit.setOnClickListener(this::exitApp)
        buttonStart.setOnClickListener(this::startNew)

    }

    fun startNew(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun exitApp(view: View) {
        finish()
    }

}