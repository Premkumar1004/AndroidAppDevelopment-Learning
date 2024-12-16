package com.example.optionmenuapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.aboutusId ->
                Toast.makeText(this,"About Us Clicked",Toast.LENGTH_SHORT).show()
            R.id.settingsId ->
                Toast.makeText(this,"Settings Clicked",Toast.LENGTH_SHORT).show()
            R.id.logoutId ->
                Toast.makeText(this,"logout successful",Toast.LENGTH_SHORT).show()
        }


        return super . onOptionsItemSelected(item)
    }
}