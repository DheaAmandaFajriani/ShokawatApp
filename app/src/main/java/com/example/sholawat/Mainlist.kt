package com.example.sholawat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Mainlist : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<list>
    lateinit var imagelist: Array<Int>
    lateinit var namelist: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainlist)

        val pmi2List = listOf<list>(
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",
            ),
            list(
                R.drawable.img,
                "Sholawat 1",

            )

        )


        val recyclerView = findViewById<RecyclerView>(R.id.rvsholawat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = rvsholawat(this, pmi2List) {

        }
    }
}