package com.example.sholawat

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class rvsholawat(
    private val context: Context, private val pmi2: List<list>, val listener: (list) -> Unit)
    : RecyclerView.Adapter<rvsholawat.listViewHolder>(){
    class listViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.img_item_photo)
        val name = view.findViewById<TextView>(R.id.tv_item_name)
        val cardView = view.findViewById<CardView>(R.id.card_view)

        fun bindView(pmi2: list, listener: (list) -> Unit){
            img.setImageResource(pmi2.imglist)
            name.text = pmi2.name


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder {
        return listViewHolder(
            LayoutInflater.from(context).inflate(R.layout.sholawat_list, parent, false)
        )
    }


    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        holder.bindView(pmi2[position], listener)
        holder.cardView.setOnClickListener{
            val context1 = holder.itemView.context
            val intent= Intent(context1,tampilanLirik::class.java).apply {
                putExtra("nama",pmi2[position].name)
                putExtra("alamat",pmi2[position].imglist)
                putExtra("lirik",pmi2[position].lirik)
            }
            context1.startActivity(intent)
        }
    }



    override fun getItemCount(): Int = pmi2.size
}