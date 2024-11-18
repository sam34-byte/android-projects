package com.theandroidfactory.seasonone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learnMoreButton : Button = findViewById(R.id.learnMoreButton)
        val titleTextView : TextView = findViewById(R.id.titleTv)

        learnMoreButton.setOnClickListener {
            val title = titleTextView.text
            val intent =  Intent(it.context, DetailActivity::class.java)
            intent.putExtra("title", title)
            startActivity(intent)
        }
    }
}