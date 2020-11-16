package com.example.uiact

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log
import android.content.Intent


class MainActivity : AppCompatActivity() {

    lateinit var slider : SeekBar
    lateinit var value : TextView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val nextpButton = findViewById<Button>(R.id.nextp)
            var userAges = findViewById<TextView>(R.id.textView2)
            val firstn = findViewById<EditText>(R.id.firstn)
            val lastn = findViewById<EditText>(R.id.lastn)
            //val usrAge = findViewById<TextView>(R.id.textView2)
            val userEmail = findViewById<EditText>(R.id.emailAd)
            val userPhone = findViewById<EditText>(R.id.phoneNum)
            //val finalB = findViewById<Button>(R.id.signupBut)
            slider = findViewById<SeekBar>(R.id.ageSeekBar)
            slider.max = 60
            slider.min = 18
            slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                @SuppressLint("SetTextI18n")
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    userAges.text = "Age: ${p1.toString()}"
                }


                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

            })


           nextpButton.setOnClickListener{
                val firstname = firstn.text.toString()
                val lastname = lastn.text.toString()
                val userAge = userAges.text.toString()
                val emailAddress = userEmail.text.toString()
                val phoneNumber = userPhone.text.toString()

                val intent = Intent(this@MainActivity, DisplayAct::class.java)
                intent.putExtra("First Name: ", firstname)
                intent.putExtra("Last Name: ", lastname)
                intent.putExtra("Age: ", userAge)
                intent.putExtra("Email Address: ", emailAddress)
                intent.putExtra("Phone Number: ", phoneNumber)
                startActivity(intent)
            }

        }

    }


    




