package com.example.myhelloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnSayHello :Button
    lateinit var tvFirstName:TextView
    lateinit var tvLastName:TextView
    lateinit var etAddSomething:EditText


    var creditPrice = 10


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_events)

        btnSayHello = findViewById(R.id.btn_say_hello)
        tvFirstName = findViewById(R.id.tv_first_name)
        tvLastName = findViewById(R.id.tv_last_name)
        etAddSomething = findViewById(R.id.et_add_something)

        // METHOD - 1
        /*btnSayHello.setOnClickListener {
            Toast.makeText(this, "Hi android", Toast.LENGTH_LONG).show()
        }*/

        btnSayHello.setOnClickListener(this)

    }

    // METHOD - 2
    fun clickButton(v: View){
        Toast.makeText(this, "This is from function", Toast.LENGTH_LONG).show()
    }

    // METHOD - 3
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn_say_hello ->{

                //var getName = tvFirstName.text

                //Toast.makeText(this, tvFirstName.text.toString().plus(tvLastName.text.toString()) , Toast.LENGTH_LONG).show()
                //Toast.makeText(this, tvFirstName.text.toString() , Toast.LENGTH_LONG).show()

                tvFirstName.text = etAddSomething.text
                //tvLastName.text = "Last Name"
            }
        }
    }


}