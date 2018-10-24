package com.craig.codelabsfirstapptut

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

//Gives direct access to textView
import kotlinx.android.synthetic.main.activity_main.textView




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        //val myToast = Toast.makeText(this,message,duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View) {

        // Get the value of the text view.
        val countString = textView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        textView.text = count.toString();
    }

    fun randomMe(view:View){
        //Create an Intent to start the second activity
        val randomIntent = Intent(this,SecondActivity::class.java)

        //get the current value of the text view
        val countString = textView.text.toString()

        //Convert the count to an int
        val count = Integer.parseInt(countString)

        //add the count to the extras for the intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)

        //start the activity
        startActivity(randomIntent)

    }
}
