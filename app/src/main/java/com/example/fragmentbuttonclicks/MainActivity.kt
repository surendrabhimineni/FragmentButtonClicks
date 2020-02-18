package com.example.fragmentbuttonclicks

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Activity A is Oncreate")

        button1.setOnClickListener{

            val textFragment = TextFragment()

            val manager = supportFragmentManager

            val transaction = manager.beginTransaction()

            transaction.replace(R.id.fragment_container, textFragment)

            transaction.addToBackStack(null)

            transaction.commit()
        }

        button2.setOnClickListener{

            val imageFragment = ImageFragment()

            val manager = supportFragmentManager

            val transaction = manager.beginTransaction()

            transaction.replace(R.id.fragment_container, imageFragment)

            transaction.addToBackStack(null)

            transaction.commit()
        }

    }

    override fun onPause() {
        super.onPause()
        println("Activity A is OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Activity A is OnDestroy")
    }

    override fun onStart() {
        super.onStart()
        println("Activity A is OnStart")
    }

    override fun onResume() {
        super.onResume()
        println("Activity A is OnResume")
    }

    override fun onStop() {
        super.onStop()
        println("Activity A is OnStop")
    }
}
