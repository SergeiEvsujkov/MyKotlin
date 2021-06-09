package com.example.mykotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();

    }

    private fun initView() {
        val textView: TextView = findViewById(R.id.textView)
        val country: TextView = findViewById(R.id.country)
        val country1: TextView = findViewById(R.id.country1)
        val button: Button = findViewById(R.id.button);
        val newCopyCountry = Country.clone();
        val myClass = MyClass("Sergei", 29)
        button.setOnClickListener {
            textView.text = myClass.toString()
            country.text = Country.toString()
            country1.text = newCopyCountry.toString()
        }

    }


}