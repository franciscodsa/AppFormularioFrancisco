package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.editTextText)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val inputText = txt.text.toString()
            if (inputText.isNotEmpty())
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, R.string.nada_escrito, Toast.LENGTH_SHORT).show()

        }
    }


}