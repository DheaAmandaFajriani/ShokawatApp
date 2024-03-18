package com.example.sholawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val screenDelay: Long = 1500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app's main activity
            val i = Intent(this, Mainlist::class.java) // Replace MainActivity with your desired activity
            startActivity(i)

            // Close this activity
            finish()
        }, screenDelay)
    }
}