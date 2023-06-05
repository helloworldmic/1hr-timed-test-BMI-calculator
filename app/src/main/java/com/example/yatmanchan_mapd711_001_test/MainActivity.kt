package com.example.yatmanchan_mapd711_001_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val age =findViewById<EditText>(R.id.age)
        val weight = findViewById<EditText>(R.id.weight)
        val height = findViewById<EditText>(R.id.height)
var calory:Double = 0.0
        val group = findViewById<View>(R.id.radiogroup) as RadioGroup

        var spinner = findViewById<View>(R.id.spinner) as Spinner

        val submit = findViewById<View>(R.id.submit) as Button
        val i = Intent(this@MainActivity, ResultActivity::class.java)

   group.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId !=null){
            val radioButtonSelected = findViewById<View>(checkedId) as RadioButton
                val gender = radioButtonSelected.text




       submit.setOnClickListener {
           var bmr = ""

           val name = name.text.toString()
           val age = age.text.toString()
           val weight = weight.text.toString()
           val height = height.text.toString()
           val activityLevelSelected = spinner.selectedItem.toString()
           if ( gender.toString() == "male"){
                bmr = (10*weight.toFloat()+6.25*height.toFloat()-5*age.toInt()+5).toString()
               i.putExtra("bmr", bmr)

               if(activityLevelSelected.toString()=="Few OR No exercise"){

                   calory=   1.2*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }
               else if( activityLevelSelected.toString()=="Light exercise 1–3 days per week"){
                   calory=   1.375*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }
               else if( activityLevelSelected.toString()=="Medium exercise 4–5 days per week"){
                   calory=  1.55*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }

               else if (activityLevelSelected.toString()=="Vigorous exercise 6–7 days per week"){
                   calory=  1.725*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )}
           }
           else{
               bmr= (10*weight.toFloat()+6.25*height.toFloat()-5*age.toInt()-161).toString()
               i.putExtra("bmr", bmr)

               if(activityLevelSelected.toString()=="Few OR No exercise"){

                   calory=   1.2*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }
               else if( activityLevelSelected.toString()=="Light exercise 1–3 days per week"){
                   calory=   1.375*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }
               else if( activityLevelSelected.toString()=="Medium exercise 4–5 days per week"){
                   calory=  1.55*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )
               }

               else if (activityLevelSelected.toString()=="Vigorous exercise 6–7 days per week"){
                   calory=  1.725*bmr.toFloat()
                   i.putExtra("caloryneeded",calory.toString() )}
           }





           i.putExtra("name", name)
           i.putExtra("age", age)
           i.putExtra("weight", weight)
           i.putExtra("height", height)
           i.putExtra("activity level", activityLevelSelected.toString())
           i.putExtra("gender", gender)

           startActivity(i)
       } }
            else{
                Toast.makeText(this,"Please choose the gender", Toast.LENGTH_LONG).show()

       }
   }









    }


}