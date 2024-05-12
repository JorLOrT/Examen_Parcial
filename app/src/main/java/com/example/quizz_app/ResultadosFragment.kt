package com.example.quizz_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView

class ResultadosFragment : Fragment(R.layout.fragment_resultados) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Variable para almacenar el número de aciertos obtenidos
        var aciertos: Int = 0
        // Recupera el número de aciertos del bundle pasado desde el fragmento anterior
        arguments.let {bundle->
          aciertos = bundle?.getInt("aciertos").toString().toInt()
        }
        // Obtiene referencias a los TextViews para mostrar la cantidad de aciertos y el reconocimiento
        val aciertos_tv: TextView = view.findViewById(R.id.cantAciertos)
        val reconocimiento_tv: TextView = view.findViewById(R.id.reconocimiento)
        // Establece el texto de la cantidad de aciertos
        aciertos_tv.text = "${aciertos}/7"
        // Evalúa el número de aciertos y obtiene el texto de reconocimiento correspondiente
        val reconocimiento: String = evaluar(aciertos)
        reconocimiento_tv.text = reconocimiento
    }
    // Función para evaluar el número de aciertos y obtener el texto de reconocimiento correspondiente
    fun evaluar(aciertos: Int): String {
        return when (aciertos) {
            in 6..7 -> "Eres un verdadero Super Saiyajin!"
            in 3..5 -> "Estás al nivel de un Namekiano."
            else -> "Chaos podría vencerte."
        }
    }

}