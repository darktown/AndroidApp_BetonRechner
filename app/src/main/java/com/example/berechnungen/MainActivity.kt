package com.example.berechnungen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bogen = findViewById<Button>(R.id.buBogen)
        val menge = findViewById<Button>(R.id.buMenge)
        val rund = findViewById<Button>(R.id.rund)

        bogen.setOnClickListener {
            val buber = Intent(this, BogenBerechnen::class.java)
            startActivity(buber)
        }
        menge.setOnClickListener {
            val betonmenge = Intent(this, BetonMenge::class.java)
            startActivity(betonmenge)
        }
        rund.setOnClickListener {
            val rundbehaelter = Intent(this, RundBe::class.java)
            startActivity(rundbehaelter)
        }

        /*

       */

    }
}
