package com.example.fragmentbuttonclicks

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.stream.DoubleStream.builder

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

        //Alert Dialog
        button3.setOnClickListener{

            val alertDialog = AlertDialog.Builder(this)

            alertDialog.setMessage("Do you want to close this application")
                .setCancelable(false)

                .setPositiveButton("proceed",DialogInterface.OnClickListener {
                    dialog, id ->finish()
                })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener{
                    dialog, id -> dialog.cancel()
                })
                .setNeutralButton("ok",DialogInterface.OnClickListener{
                    dialog, id -> dialog.dismiss()
                })

            val alert = alertDialog.create()
            alert.setTitle("Alert Dialog")
            alert.show()
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
