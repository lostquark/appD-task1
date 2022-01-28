package com.example.john_appd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var string: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.button)
        editText= findViewById(R.id.editTextTextPersonName)
        button.setOnClickListener{
            string = editText.text.toString()
            Toast.makeText(this.applicationContext, "hi I am ${string}\ngo! corona go!", Toast.LENGTH_SHORT).show()
        }
    }
}