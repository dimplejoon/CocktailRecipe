package com.dimplejoon.cocktailrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.faust_image)
        val image2 = findViewById<ImageView>(R.id.oldfashioned_image)
        val image3 = findViewById<ImageView>(R.id.screwdriver_image)
        val image4 = findViewById<ImageView>(R.id.cosmopolitan_image)
        val image5 = findViewById<ImageView>(R.id.godfather_image)
        val image6 = findViewById<ImageView>(R.id.manhattan_image)
        val image7 = findViewById<ImageView>(R.id.eggnog_image)
        val image8 = findViewById<ImageView>(R.id.martini_image)
        val image9 = findViewById<ImageView>(R.id.mojito_image)

        image1.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","faust")
            startActivity(intent)
        }

        image2.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","oldfashioned")
            startActivity(intent)
        }

        image3.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","screwdriver")
            startActivity(intent)
        }

        image4.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","cosmopolitan")
            startActivity(intent)
        }

        image5.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","godfather")
            startActivity(intent)
        }

        image6.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","manhattan")
            startActivity(intent)
        }

        image7.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","eggnog")
            startActivity(intent)
        }

        image8.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","martini")
            startActivity(intent)
        }

        image9.setOnClickListener {

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("MESSAGE","mojito")
            startActivity(intent)
        }


    }

}


