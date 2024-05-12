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
        var aciertos: Int = 0

        arguments.let {bundle->
          aciertos = bundle?.getInt("aciertos").toString().toInt()
        }

        val aciertos_tv: TextView = view.findViewById(R.id.cantAciertos)
        val reconocimiento_tv: TextView = view.findViewById(R.id.reconocimiento)

        aciertos_tv.text = "${aciertos}/7"
        val reconocimiento: String = evaluar(aciertos)
        reconocimiento_tv.text = reconocimiento
    }

    fun evaluar(aciertos: Int): String {
        return when (aciertos) {
            in 6..7 -> "Eres un verdadero Super Saiyajin!"
            in 3..5 -> "Estás al nivel de un Namekiano."
            else -> "Chaos podría vencerte."
        }
    }

}