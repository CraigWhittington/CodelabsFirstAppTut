package com.craig.codelabsfirstapptut

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber(){
        //Get count from intent extras
        val count = intent.getIntExtra(TOTAL_COUNT,0)

        //Generate the random number
        val random = Random()
        var randomInt = 0
        //Add 1 because bound is exlusive
        if(count > 0){
            //Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }
        //Display the random num
        textview_random.text = Integer.toString(randomInt)

        //Substitute the max value into the string resource
        //for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)
    }
}
