package com.theandroidfactory.seasonone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val titleFromAnotherActivity = intent.getStringExtra("title") ?: "No title"
        val textView : TextView = findViewById(R.id.titleTv)
        textView.text = titleFromAnotherActivity
    }
}