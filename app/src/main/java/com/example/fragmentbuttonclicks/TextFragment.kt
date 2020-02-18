package com.example.fragmentbuttonclicks

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


class TextFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Fragment A is OnCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Get the custom view for this fragment layout
        val view = inflater!!.inflate(R.layout.text_fragment, container, false)

        // Get the text view widget reference from custom layout
        val tv = view.findViewById<TextView>(R.id.text_view)

        // Set a click listener for text view object
        tv.setOnClickListener {
            // Change the text color
            tv.setTextColor(Color.BLACK)

            // Show click confirmation
            Toast.makeText(view.context, "TextView clicked.", Toast.LENGTH_SHORT).show()
        }

        // Return the fragment view/layout
        return view
        println("Fragment A is OnCreateView")
    }

    override fun onPause() {
        super.onPause()
        println("Fragment A is OnPause")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("Fragment A is OnAttach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Fragment A is OnDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("Fragment A is OnDetach")
    }

    override fun onStart() {
        super.onStart()
        println("Fragment A is OnStart")
    }

    override fun onResume() {
        super.onResume()
        println("Fragment A is OnResume")
    }

    override fun onStop() {
        super.onStop()
        println("Fragment A is OnStop")
    }
}
