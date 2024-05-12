package com.example.quizz_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController


class AnswerFragment : Fragment(R.layout.fragment_answer) {
    // Variable para almacenar la posición actual de la pregunta
    var posicion: Int = 1
    // Variable para rastrear el número de respuestas correctas
    var aciertos: Int = 0
    // Lista para contener todas las preguntas (obtenida de la clase ListaPreguntas)
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
        // Recupera los datos del bundle pasado desde el fragmento anterior
        arguments.let {bundle->
            resultadoObtenido = bundle?.getString("respuesta").toString()
            posicion = bundle?.getInt("posicion").toString().toInt()
            aciertos = bundle?.getInt("aciertos").toString().toInt()
        }
        // Obtiene el objeto de la pregunta actual de la lista
        val pregunta: Pregunta = listaPreguntas[posicion - 1]
        // Establece el texto de la respuesta según el estado recibido
        if (resultadoObtenido == "si"){
            respuesta.text = "CORRECTO"
        }
        else{
            respuesta.text = "INCORRECTO"
        }
        // Establece el texto de la explicación para la pregunta actual
        explicacion.text = pregunta.explicacion
        // Obtiene la referencia al botón "Continuar"
        val btn_continuar: Button = view.findViewById(R.id.btn_continuar)
        if(posicion == listaPreguntas.size){
            btn_continuar.text = "Finalizar"  // Establece el texto a "Finalizar" si es la última pregunta
            btn_continuar.setOnClickListener {
                val resultadoClic = bundleOf("aciertos" to aciertos)
                view.findNavController().navigate(R.id.action_answerFragment_to_resultadosFragment, resultadoClic)
            }
        }
        else{
            btn_continuar.text ="Siguiente" // Establece el texto a "Siguiente" para otras preguntas
            btn_continuar.setOnClickListener {
                posicion++ // Incrementa la posición para la siguiente pregunta
                val resultadoClic = bundleOf("posicion" to posicion, "aciertos" to aciertos)
                view.findNavController().navigate(R.id.action_answerFragment_to_questionFragment, resultadoClic)
            }
        }
    }
}