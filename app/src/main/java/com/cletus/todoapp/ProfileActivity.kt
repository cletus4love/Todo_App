package com.cletus.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    private lateinit var homebutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        homebutton = findViewById(R.id.homebutton)
        homebutton.setOnClickListener {
    val anyIntent = Intent(this, HomeActivity::class.java)
            startActivity(anyIntent)

    }
}