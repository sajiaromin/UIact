package com.example.uiact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var intent = intent
        val firstname = intent.getStringExtra("First Name: ")
        val lastname = intent.getStringExtra("Last Name: ")
        val userAge = intent.getStringExtra("Age: ")
        val emailAddress = intent.getStringExtra("Email Address:")
        val phoneNumber = intent.getStringExtra("Phone Number: ")

        val textView3 = findViewById<TextView>(R.id.textView3)
        textView3.text ="First Name: "+firstname+"\nLast Name: "+lastname+"\nAge: "+userAge+"\nEmail"+emailAddress+"\nPhone Number: "+phoneNumber+"\n"


    }
}