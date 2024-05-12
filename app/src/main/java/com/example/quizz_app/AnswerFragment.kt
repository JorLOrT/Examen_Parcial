package com.example.quizz_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class AnswerFragment : Fragment(R.layout.fragment_answer) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val respuesta: TextView = view.findViewById(R.id.resultadoRespuesta)
        val explicacion: TextView = view.findViewById(R.id.explicacion)
    }

}