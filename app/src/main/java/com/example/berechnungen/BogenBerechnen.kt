package com.example.berechnungen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BogenBerechnen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bogen_berechnen)

        val buberechnen = findViewById<Button>(R.id.buBerechnung)
        val zur = findViewById<Button>(R.id.buBack)
        var durchmesser = findViewById<EditText>(R.id.durchmesser).text
        var winkel = findViewById<EditText>(R.id.winkel).text
        val pi = kotlin.math.PI
        var ergebnis = findViewById<TextView>(R.id.erg)
        var erg = 0.00


        buberechnen.setOnClickListener {


            if(durchmesser.length == 0){
                ergebnis.text = "Bitte einen Durchmesser angeben"
            } else if(winkel.length == 0){
                ergebnis.text = "Bitte einen Winkel angeben"
            } else if(winkel.length == 0 && durchmesser.length == 0){
                ergebnis.text = "Bitte einen Durchmesser und Winkel angeben"
            }
            else {
                erg = pi * durchmesser.toString().toDouble() * winkel.toString().toDouble() / 360
                var ergebn = String.format("%.2f", erg)
                ergebnis.text = "$ergebn m"

            }




        }

        zur.setOnClickListener { finish() }



    }
}

