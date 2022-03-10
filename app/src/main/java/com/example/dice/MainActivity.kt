package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
            /**
             * a pop will come after button click
             */
            val toast = Toast.makeText(this,"Dice Rolled !!!", Toast.LENGTH_SHORT);
            val resultTextView : TextView = findViewById(R.id.textView);
            toast.show();
            rollDice(findViewById(R.id.textView));

        }
    }

    /**
     * random number gen
     */
    private fun rollDice( resultTextView : TextView){
        val diceRoll = Dice(6).roll();
        resultTextView.text = diceRoll.toString();
    }
}

class Dice(private val sides : Int){

    fun roll() : Int {
        val randomNumber = (1..sides).random();
        return randomNumber;
    }
}