package com.example.sholawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class TentangKami : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_kami)


        btnback = findViewById(R.id.btn_back2)
        btnback.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back2 -> {
                val intent = Intent(this, Mainlist::class.java)
                startActivity(intent)
            }
        }
    }
}