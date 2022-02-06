package com.example.berechnungen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RundBe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rund_be)


        val berechnen = findViewById<Button>(R.id.buBerechnung2)
        val innen = findViewById<EditText>(R.id.innen).text
        val pi = kotlin.math.PI
        val boden = findViewById<EditText>(R.id.boden).text
        val hoehe = findViewById<EditText>(R.id.hoehe).text
        val wand = findViewById<EditText>(R.id.wand).text


        berechnen.setOnClickListener{

            //berechnung des Rohres ohne Boden.
            val hoeheohneb = hoehe.toString().toDouble() - boden.toString().toDouble()

            //Durchmesser zum Radius
            val inrad = innen.toString().toDouble() / 2

            //berechnung des außenraduis
            val ausrad = inrad + wand.toString().toDouble()







        }


    }
}