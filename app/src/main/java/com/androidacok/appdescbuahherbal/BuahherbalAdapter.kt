package com.androidacok.appdescbuahherbal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class BuahherbalAdapter (private val context: Context, private val buahherbal: List<Buahherbal>, val listener: (Buahherbal) -> Unit)
    :RecyclerView.Adapter<BuahherbalAdapter.BuahherbalViewHolder>() {

    class BuahherbalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgBuahherbal = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBuahherbal = view.findViewById<TextView>(R.id.tv_item_name)
        val decsBuahherbal = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview (buahherbal: Buahherbal, listener: (Buahherbal) -> Unit ){
           imgBuahherbal.setImageResource(buahherbal.imgBuahherbal)
           nameBuahherbal.text = buahherbal.nameBuahherbal
            decsBuahherbal.text= buahherbal.descBuahherbal
            itemView.setOnClickListener{
                listener(buahherbal)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahherbalViewHolder {
        return BuahherbalViewHolder(LayoutInflater.from(context)
            .inflate(R.layout.item_buahherbal, parent, false))
    }

    override fun onBindViewHolder(holder: BuahherbalViewHolder, position: Int) {
        holder.bindview(buahherbal[position], listener)
    }

    override fun getItemCount(): Int = buahherbal.size
    }

