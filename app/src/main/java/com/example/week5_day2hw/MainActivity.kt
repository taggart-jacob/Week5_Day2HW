package com.example.week5_day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

data class Person(var firstName : String, var lastName : String, var address : String, var city : String, var state : String, var zip : String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view : View){
        when (view.id) {
            R.id.btnSend -> {
                var person = Person(etFirstName.text.toString(), etLastName.text.toString(), etAddress.text.toString(), etCity.text.toString(), etState.text.toString(), etZip.text.toString())
                tvFirstName.text = person.firstName
                tvLastName.text = person.lastName
                tvAddress.text = person.address
                tvCity.text = person.city
                tvState.text = person.state
                tvZip.text = person.zip

                etFirstName.setText("")
                etLastName.setText("")
                etAddress.setText("")
                etCity.setText("")
                etState.setText("")
                etZip.setText("")
            }
            else -> {}
        }
    }
}
