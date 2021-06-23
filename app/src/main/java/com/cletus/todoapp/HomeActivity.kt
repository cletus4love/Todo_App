package com.cletus.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay:TextView
    private lateinit var Profiledetails:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)
        Profiledetails = findViewById(R.id.Profiledetails)

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("name")}"
        Profiledetails.setOnClickListener {
        }
        fun openProfilePages() {
            val intent: Intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            openProfilePages()
        }
    }}