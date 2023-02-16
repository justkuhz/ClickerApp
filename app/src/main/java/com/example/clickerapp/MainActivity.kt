package com.example.clickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var item1: TextView
    private lateinit var item2: TextView
    private lateinit var item3: TextView
    private lateinit var item4: TextView
    private lateinit var item5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item1 = findViewById(R.id.item1)
        item2 = findViewById(R.id.item2)
        item3 = findViewById(R.id.item3)
        item4 = findViewById(R.id.item4)
        item5 = findViewById(R.id.item5)
    }

    fun count1(view: View) {
        val countString = item1.text.toString()
        var countInt = countString.toInt()
        countInt++
        item1.text = countInt.toString()
    }

    fun count2(view: View) {
        val countString = item2.text.toString()
        var countInt = countString.toInt()
        countInt++
        item2.text = countInt.toString()
    }

    fun count3(view: View) {
        val countString = item3.text.toString()
        var countInt = countString.toInt()
        countInt++
        item3.text = countInt.toString()
    }

    fun count4(view: View) {
        val countString = item4.text.toString()
        var countInt = countString.toInt()
        countInt++
        item4.text = countInt.toString()
    }

    fun count5(view: View) {
        val countString = item5.text.toString()
        var countInt = countString.toInt()
        countInt++
        item5.text = countInt.toString()
    }

    fun reset(view: View) {
        val default: String = "0"
        item1.text = default
        item2.text = default
        item3.text = default
        item4.text = default
        item5.text = default
    }
}