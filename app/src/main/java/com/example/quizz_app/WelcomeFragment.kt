package com.example.quizz_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eventos(view)
    }

    fun eventos(view: View){
        val btnComenzar = view.findViewById<Button>(R.id.comenzar)
        btnComenzar.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_questionFragment)
        }
    }


}