package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.example.interactiveapp.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonRead=findViewById<Button>(R.id.btnRead)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)

        buttonRead.setOnClickListener{
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            // change to dark mode
            layout.setBackgroundResource(R.color.black)
        }
    }
}