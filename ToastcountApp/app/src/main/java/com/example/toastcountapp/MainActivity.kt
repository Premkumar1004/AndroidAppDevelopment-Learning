package com.example.toastcountapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var toast_btn:Button
    lateinit var tv:TextView
    lateinit var count_btn:Button
    lateinit var decrement_btn:Button
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_btn = findViewById(R.id.toast_btn)
        tv = findViewById(R.id.tv)
        count_btn = findViewById(R.id.count_btn)
        decrement_btn = findViewById(R.id.decrement_btn)

        count_btn.setOnClickListener {
            counter = counter+1
            tv.text=counter.toString()
        }
        decrement_btn.setOnClickListener {
            if (counter<=0) counter=0;
            else
                counter--;
            tv.text=counter.toString()
        }


    }
    fun showtoast(view: View){
        Toast.makeText(this,"Hello Prem",Toast.LENGTH_SHORT).show()
    }
}