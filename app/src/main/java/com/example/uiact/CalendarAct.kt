package com.example.uiact

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class CalendarAct : AppCompatActivity() {
    lateinit var calendarView: CalendarView
    lateinit var dateView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val pickBtn = findViewById<Button>(R.id.pickBtn)
        val birthDate = findViewById(R.id.textView4) as TextView
        val finalBtn = findViewById<Button>(R.id.signupBut)
        var bday = findViewById(R.id.textView4) as TextView

        pickBtn.setOnClickListener{
            val hbd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {view: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->
                birthDate.setText("" + mDay + "/" + mMonth + "/" + mYear)
            },
        year, month, day)
            hbd.show()
        }

        finalBtn.setOnClickListener{
            var habadu =bday.text.toString()
            val firstname = intent.getStringExtra("First Name: ")
            val lastname = intent.getStringExtra("Last Name: ")
            val userAge = intent.getStringExtra("Age: ")
            val emailAddress = intent.getStringExtra("Email Address: ")
            val phoneNumber = intent.getStringExtra("Phone Number: ")

            val intent = Intent(this@CalendarAct, DisplayAct::class.java)
            intent.putExtra("First Name: ", firstname)
            intent.putExtra("Last Name: ", lastname)
            intent.putExtra("Age: ", userAge)
            intent.putExtra("Email Address: ", emailAddress)
            intent.putExtra("Phone Number: ", phoneNumber)
            startActivity(intent)
}

    }
}