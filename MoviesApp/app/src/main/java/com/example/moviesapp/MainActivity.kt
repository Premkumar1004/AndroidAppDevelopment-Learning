package com.example.moviesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {

    lateinit var rec :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rec = findViewById(R.id.rec)

        val images = mutableListOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e)

        val names = mutableListOf("Bahubali2","Jai Bheam","RRR","Devara","Pushpa2",
            "Bahubali2","Jai Bheam","RRR","Devara","Pushpa2",
            "Bahubali2","Jai Bheam","RRR","Devara","Pushpa2")

        rec.layoutManager = LinearLayoutManager(this)
        rec.adapter = MovieAdapter(this,names,images)
    }
}