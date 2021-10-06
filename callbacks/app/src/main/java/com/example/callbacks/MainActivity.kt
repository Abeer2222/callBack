package com.example.callbacks

import android.content.Context
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.*
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: ImageButton
    val Tag = "Activity 1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onCreate:")

        myButton = findViewById(R.id.btn)

        myButton.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy $Tag", Toast.LENGTH_LONG).show()
        Log.d(Tag, "onDestroy: ")
    }


}