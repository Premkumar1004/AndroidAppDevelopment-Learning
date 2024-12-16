package com.example.intentsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var explicitIntent:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        explicitIntent = findViewById(R.id.explicitIntent)

        explicitIntent.setOnClickListener {
            val intent = Intent(this,
                SecondActivity::class.java)
            startActivity(intent)
        }

    }
    fun implicitIntent(view: View) {
        val uri = Uri.parse("https://www.google.com")
        val intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}