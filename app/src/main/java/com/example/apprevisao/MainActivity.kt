package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnComparar).setOnClickListener {
            compararNumeros()
        }

    }

    private fun compararNumeros() {
        val numVal1 = findViewById<EditText>(R.id.txtVal1).text.toString()
        val numVal2 = findViewById<EditText>(R.id.txtVal2).text.toString()

        try {
            val val1 = numVal1.toFloat()
            val val2 = numVal2.toFloat()

            if (val1 < val2) {
                Toast.makeText(
                    this, "O Segundo Número é Maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if (val1 > val2) {
                Toast.makeText(
                    this, "O Primeiro Número é Maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if (val1 == val2) {
                Toast.makeText(
                    this, "Os Números são Iguais!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        catch (err: NumberFormatException) {
            Toast.makeText(
                this, "Um ou Dois Números Inválidos!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}