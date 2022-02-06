package com.example.berechnungen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BetonMenge : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beton_menge)

        val bulaenge = findViewById<EditText>(R.id.bulaenge)
        val breite = findViewById<EditText>(R.id.breite)
        val hoehe = findViewById<EditText>(R.id.beton_hoehe)
        val ergtext = findViewById<TextView>(R.id.ergebnis_menge)
        val zu =findViewById<Button>(R.id.buBack2)

        val berechnen = findViewById<Button>(R.id.buberech2)

        berechnen.setOnClickListener {
            val erg = bulaenge.text.toString().toDouble() * breite.text.toString().toDouble() * hoehe.text.toString().toDouble()
            val ergebnis1 = String.format("%.2f", erg)
            ergtext.text = ergebnis1 + " m³ "
        }

        zu.setOnClickListener{finish()}


    }
}