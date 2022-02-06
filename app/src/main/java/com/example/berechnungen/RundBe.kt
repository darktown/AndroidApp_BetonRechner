package com.example.berechnungen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RundBe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rund_be)

        val innen = findViewById<EditText>(R.id.innen).text
        //val rad = innen.toString().toDouble() / 2
        val pi = kotlin.math.PI
        val boden = findViewById<EditText>(R.id.boden).text
        //val bo = boden.toString().toDouble()




    }
}