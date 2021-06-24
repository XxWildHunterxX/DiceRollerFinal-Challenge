package com.junhao.dicerollerimage

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnRoll : Button = findViewById(R.id.btnDiceRoll)

        btnRoll.setOnClickListener(){

            rollDice()

        }


    }


    private fun rollDice() {

        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)

        val res1 = resources.getIdentifier("dice_"+getRandomDiceImage(),"drawable","com.junhao.dicerollerimage")
        val res2 = resources.getIdentifier("dice_"+getRandomDiceImage(),"drawable","com.junhao.dicerollerimage")

        diceImage.setImageResource(res1)
        diceImage2.setImageResource(res2)
    }

    private fun getRandomDiceImage(): Int {

return (1..6).random()

    }


}