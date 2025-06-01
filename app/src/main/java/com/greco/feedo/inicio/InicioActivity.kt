package com.greco.feedo.inicio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.greco.feedo.R
import com.greco.feedo.menu.MenuActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent=Intent(this,MenuActivity::class.java)
            startActivity(intent)
         }
    }
}
