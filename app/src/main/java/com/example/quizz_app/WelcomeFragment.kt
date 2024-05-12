package com.example.quizz_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eventos(view)
        val logo:ImageView = view.findViewById<ImageView>(R.id.logo)
        logo.setImageResource(R.drawable.dbz_logo)
    }

    fun eventos(view: View){
        val btnComenzar = view.findViewById<Button>(R.id.comenzar)
        btnComenzar.setOnClickListener {
            val posicion = 1
            val aciertos = 0
            val resultadoClic = bundleOf( "posicion" to posicion, "aciertos" to aciertos)
            view.findNavController().navigate(R.id.action_welcomeFragment_to_questionFragment, resultadoClic)
        }
    }

}