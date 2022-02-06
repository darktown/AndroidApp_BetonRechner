package com.example.berechnungen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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
        val ergebnis = findViewById<TextView>(R.id.erg2)


        berechnen.setOnClickListener{

            //berechnung des Rohres ohne Boden.
            val hoeheohneb = hoehe.toString().toDouble() - boden.toString().toDouble()

            //Durchmesser zum Radius
            val inrad = innen.toString().toDouble() / 2

            //berechnung des außenraduis
            val ausrad = inrad + wand.toString().toDouble()

            //berechnung des klammerwertes
            var erg = Math.pow(ausrad, 2.0) - Math.pow(inrad, 2.0)

            //endgültige berechnung für rohr
            erg = pi * hoeheohneb.toString().toDouble() * erg

            //volumen boden
            var ergkreis = pi * Math.pow(ausrad, 2.0) * boden.toString().toDouble()

            //ausrechnen des endergebnisses
            erg = ergkreis + erg

            var ergebn = String.format("%.2f", erg)
            ergebnis.text = "$ergebn m³"







        }


    }
}