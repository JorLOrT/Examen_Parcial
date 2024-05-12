package com.example.quizz_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController


class AnswerFragment : Fragment(R.layout.fragment_answer) {

    var posicion: Int = 1
    var aciertos: Int = 0
    lateinit var listaPreguntas: ArrayList<Pregunta>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listaPreguntas = ListaPreguntas.getQuestions()
        var resultadoObtenido: String

        val respuesta: TextView = view.findViewById(R.id.resultadoRespuesta)
        val explicacion: TextView = view.findViewById(R.id.explicacion)

        arguments.let {bundle->
            resultadoObtenido = bundle?.getString("respuesta").toString()
            posicion = bundle?.getInt("posicion").toString().toInt()
            aciertos = bundle?.getInt("aciertos").toString().toInt()
        }

        val pregunta: Pregunta = listaPreguntas[posicion - 1]

        if (resultadoObtenido == "si"){
            respuesta.text = "CORRECTO"
        }
        else{
            respuesta.text = "INCORRECTO"
        }

        explicacion.text = pregunta.explicacion

        val btn_continuar: Button = view.findViewById(R.id.btn_continuar)
        if(posicion == listaPreguntas.size){
            btn_continuar.text = "Finalizar"
            btn_continuar.setOnClickListener {
                val resultadoClic = bundleOf("aciertos" to aciertos)
                view.findNavController().navigate(R.id.action_answerFragment_to_resultadosFragment, resultadoClic)
            }
        }
        else{
            btn_continuar.text ="Siguiente"
            btn_continuar.setOnClickListener {
                posicion++
                val resultadoClic = bundleOf("posicion" to posicion, "aciertos" to aciertos)
                view.findNavController().navigate(R.id.action_answerFragment_to_questionFragment, resultadoClic)
            }
        }
    }
}