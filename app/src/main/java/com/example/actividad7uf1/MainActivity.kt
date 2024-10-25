package com.example.actividad7uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextText)
        val editText1 = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val text = editText.text.toString()
            val text2 = editText1.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            Log.d("InputType", text2)
        }
    }
}