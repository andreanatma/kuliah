package com.dev.wisatasemarangronaldows

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val wisata = intent.getParcelableExtra<Wisata>("wisata")
        if (wisata != null) {
            val imageView: ImageView = findViewById(R.id.detailedActivityIv)
            val titleTextView: TextView = findViewById(R.id.detailedActivityTv)
            val descriptionTextView: TextView = findViewById(R.id.detailedActivityTvDesc)

            imageView.setImageResource(wisata.image)
            titleTextView.text = wisata.name
            descriptionTextView.text = wisata.description
        }
    }
}
