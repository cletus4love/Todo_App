package com.cletus.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

   private  val validUsername = "Admin"
   private   val validPassword = "admin"
    //layout variables
   private lateinit var Usernameinput :EditText
   private lateinit var Passwordinput :EditText
   private lateinit var SignIn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Usernameinput = findViewById(R.id.Usernameinput)
        Passwordinput = findViewById(R.id.Passwordinput)
        SignIn = findViewById(R.id.SignIn)
        SignIn.setOnClickListener {
        val username = Usernameinput.text.toString()
        val password = Passwordinput.text.toString()
        Login(username,password)
    }
    }
    fun Login(username:String, password:String){
    if (isValidDetails(username,password)){
        val intent : Intent = Intent( this, HomeActivity ::class.java)
        intent.putExtra("username", username)
        startActivity(intent)
    }else{
        Toast.makeText(applicationContext,"invalidDetails", Toast.LENGTH_SHORT).show()
    }
    }
    private fun isValidDetails(username: String, password: String): Boolean{
      return(password == validPassword)

    }
}