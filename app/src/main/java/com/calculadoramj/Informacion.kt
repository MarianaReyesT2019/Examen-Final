package com.calculadoramj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Informacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        val volver:Button = findViewById(R.id.infor)

        volver.setOnClickListener {
            onBackPressed()
            finish()
        }
    }
}