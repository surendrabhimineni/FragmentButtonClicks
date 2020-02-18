package com.example.fragmentbuttonclicks

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import android.view.ViewGroup as ViewGroup

class ImageFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Fragment B is OnCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Return the fragment view/layout
        return inflater!!.inflate(R.layout.image_layout,container,false)
        println("Fragment B is OnCreateView")
    }

    override fun onPause() {
        super.onPause()
        println("Fragment B is OnPause")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("Fragment B is OnAttach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Fragment B is OnDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("Fragment B is OnDetach")
    }

    override fun onStart() {
        super.onStart()
        println("Fragment B is OnStart")
    }

    override fun onResume() {
        super.onResume()
        println("Fragment B is OnResume")
    }

    override fun onStop() {
        super.onStop()
        println("Fragment B is OnStop")
    }
}
