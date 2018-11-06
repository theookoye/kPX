package com.btzw.kpx

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    fun start(view: View){
        val get_started = findViewById<Button>(R.id.login)
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}
