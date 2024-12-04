package com.theandroidfactory.SeasonTwo

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DistroTileDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distro_tile_detail)

        val distroTile = intent.getSerializableExtra("distroTile") as? DistroTile ?: DistroTile(
            title = "whoops",
            description =  "Something went wrong - please try again!"
        )

        val headerImageView : ImageView = findViewById(R.id.textHeaderImageView)
        val titleTextView : TextView = findViewById(R.id.titleTextView)
        val descriptionTextView : TextView = findViewById(R.id.descriptionTextView)
        val descriptionLongTextView : TextView = findViewById(R.id.descriptionLongTextView)

        headerImageView.setImageResource(distroTile.headerImgResId)
        titleTextView.text = distroTile.title
        descriptionTextView.text = distroTile.description
        descriptionLongTextView.text = distroTile.descriptionLong

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    /*
    The below snippet of code is written for back button on action bar
    but we don't action bar itself in the action bar
    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        return when (item.itemId){
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.menu_distro_tile_detail, menu)
        return true
    }
}