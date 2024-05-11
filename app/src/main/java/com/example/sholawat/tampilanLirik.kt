package com.example.sholawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class tampilanLirik : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnback: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_lirik)

        btnback = findViewById(R.id.btn_back2)
        btnback.setOnClickListener(this)


        val nama : TextView = findViewById(R.id.judul)
        val bundle : Bundle? = intent.extras
        val namaid = bundle?.getString("nama")
        nama.text = namaid

        val lirik : TextView = findViewById(R.id.lirik)
        val bundle1 : Bundle? = intent.extras
        val lirikid = bundle1?.getString("lirik")
        lirik.text = lirikid



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
