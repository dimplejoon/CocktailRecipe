package com.dimplejoon.cocktailrecipe

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

// I referred to "liquor.com" for all Cocktail Recipes
//カクテルのレシピは『liquor.com』を参照いたしました。
class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val getData = intent.getStringExtra("MESSAGE")

        val errorData = "Cocktail選択エラーが発生しました。再選択してください。"

        //Cocktailsのresources操作のため
        val imageArea = findViewById<ImageView>(R.id.imageArea)

        //Snackbar操作のため
        val detailsLayout = findViewById<View>(R.id.detailsLayout)


        // 『setImageResource』  vs　『setImageDrawable』
        // => 簡単なものはresourceの方がいいかも。でも、memory的にはdrawableがいいらしい  by stackoverflow

        when (getData) {

            "faust" -> {
                    imageArea.setImageResource(R.drawable.faust)
                    Snackbar.make(detailsLayout, R.string.faust_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "oldfashioned" -> {
                    imageArea.setImageResource(R.drawable.oldfashioned)
                    Snackbar.make(detailsLayout, R.string.oldfashioned_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "screwdriver" -> {
                    imageArea.setImageResource(R.drawable.screwdriver)
                    Snackbar.make(detailsLayout, R.string.screwdriver_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
            }

            "cosmopolitan" -> {
                    imageArea.setImageResource(R.drawable.cosmopolitan)
                    Snackbar.make(detailsLayout, R.string.cosmopolitan_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "godfather" -> {
                    imageArea.setImageResource(R.drawable.godfather)
                    Snackbar.make(detailsLayout, R.string.godfather_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "manhattan" -> {
                    imageArea.setImageResource(R.drawable.manhattan)
                    Snackbar.make(detailsLayout, R.string.manhattan_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "eggnog" -> {
                    imageArea.setImageResource(R.drawable.eggnog)
                    Snackbar.make(detailsLayout, R.string.eggnog_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "martini" -> {
                    imageArea.setImageResource(R.drawable.martini)
                    Snackbar.make(detailsLayout, R.string.martini_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            "mojito" -> {
                    imageArea.setImageResource(R.drawable.mojito)
                    Snackbar.make(detailsLayout, R.string.mojito_recipe, Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
                }

            else -> Snackbar.make(detailsLayout, errorData , Snackbar.LENGTH_INDEFINITE)
                        .setTextMaxLines(10)
                        .show()
            }
    }
    }


