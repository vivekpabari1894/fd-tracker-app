package com.example.fdtracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Simple layout created programmatically
        val textView = TextView(this).apply {
            text = "FD Tracker App\n\nComing Soon!\n\nBasic APK Build Successful!"
            textSize = 18f
            setPadding(50, 50, 50, 50)
        }

        val button = Button(this).apply {
            text = "Add Fixed Deposit"
            setOnClickListener {
                textView.text = "Add FD Feature - To Be Implemented"
            }
        }

        setContentView(android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            addView(textView)
            addView(button)
        })
    }
}