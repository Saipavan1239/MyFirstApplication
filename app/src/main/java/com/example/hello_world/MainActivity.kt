package com.example.hello_world

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.click)

        btnClick.setOnClickListener{
            Toast.makeText(this,"Hello this is my first program",Toast.LENGTH_SHORT).show()
        }


    }
}