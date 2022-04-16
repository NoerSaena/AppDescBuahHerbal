package com.androidacok.appdescbuahherbal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBuahherbalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buahherbal)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val buahherbal = intent.getParcelableExtra<Buahherbal>(MainActivity.INTENT_PARCELABLE)

        val imgBuahherbal = findViewById<ImageView>(R.id.img_item_photo)
        val nameBuahherbal = findViewById<TextView>(R.id.tv_item_name)
        val descBuahherbal = findViewById<TextView>(R.id.tv_item_description)

        imgBuahherbal.setImageResource(buahherbal?.imgBuahherbal!!)
        nameBuahherbal.text = buahherbal.nameBuahherbal
        descBuahherbal.text = buahherbal.descBuahherbal



    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true


    }
}