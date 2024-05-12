package com.example.quizz_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class QuestionFragment : Fragment(R.layout.fragment_question) {

    var posicion: Int = 1

    lateinit var listaPreguntas: ArrayList<Pregunta>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaPreguntas = ListaPreguntas.getQuestions()
        val tv_pregunta: TextView = view.findViewById(R.id.tv_question)
        val opcion1: TextView = view.findViewById(R.id.tv_option_one)
        val opcion2: TextView = view.findViewById(R.id.tv_option_two)
        val opcion3: TextView = view.findViewById(R.id.tv_option_three)
        val opcion4: TextView = view.findViewById(R.id.tv_option_four)


        opcion1.setOnClickListener{onCLick(1, view)}
        opcion2.setOnClickListener{onCLick(2, view)}
        opcion3.setOnClickListener{onCLick(3, view)}
        opcion4.setOnClickListener{onCLick(4, view)}

        crearPregunta(view, tv_pregunta, opcion1, opcion2, opcion3, opcion4)

    }

    private fun onCLick(respuesta: Int, view: View) {
        val esCorrecto: Boolean
        val pregunta: Pregunta = listaPreguntas[posicion - 1]
        if(pregunta.respuesta != respuesta) {
            esCorrecto = false
        }else {
            esCorrecto = true
        }
        val resultadoClic = bundleOf("respuesta" to esCorrecto)
        view.findNavController().navigate(R.id.action_questionFragment_to_answerFragment, resultadoClic)
    }

    // GENERADOR DE PREGUNTAS
    private fun crearPregunta(view: View, tv_pregunta: TextView, opcion1: TextView,opcion2: TextView, opcion3: TextView, opcion4: TextView) {
        val pregunta: Pregunta = listaPreguntas[posicion - 1]
        tv_pregunta.text = pregunta.pregunta
        opcion1.text = pregunta.opcion1
        opcion2.text = pregunta.opcion2
        opcion3.text = pregunta.opcion3
        opcion4.text = pregunta.opcion4

        // Actualiza la posición de la barra de progreso
        val barra:ProgressBar = view.findViewById(R.id.progressBar)
        barra.progress = posicion
        // Actualiza el texto que aparece al lado de la barra de progreso
        val tv_progreso: TextView = view.findViewById(R.id.tv_progress)
        tv_progreso.text = "$posicion/${barra.max}"

    }
}