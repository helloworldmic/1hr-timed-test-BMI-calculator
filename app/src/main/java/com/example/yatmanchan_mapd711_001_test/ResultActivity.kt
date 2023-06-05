package com.example.yatmanchan_mapd711_001_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val intent = intent

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val height  = intent.getStringExtra("height")
        val weight=  intent.getStringExtra("weight")
        val activityLevel = intent.getStringExtra("activity level")
        val gender = intent.getStringExtra("gender")
        val bmr = intent.getStringExtra("bmr")
val caloryneeded = intent.getStringExtra("caloryneeded")

        val resultname= findViewById<TextView>(R.id.resultname)
        val resultage= findViewById<TextView>(R.id.resultage)
        val resultweight= findViewById<TextView>(R.id.resultweight)
        val resulheight= findViewById<TextView>(R.id.resultheight)
        val activitylevel = findViewById<TextView>(R.id.activitylevel)
        val resultBMR= findViewById<TextView>(R.id.resultBMR)
val caloryneed = findViewById<TextView>(R.id.caloryneed)

        resultname.text = name.toString()
        resultage.text = age.toString()
        resultweight.text = height.toString()
        resulheight.text = weight.toString()
        activitylevel.text = activityLevel.toString()
        resultBMR.text = bmr.toString()
        caloryneed.text = caloryneeded
    }
}