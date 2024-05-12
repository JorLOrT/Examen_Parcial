package com.example.quizz_app

object ListaPreguntas{
    fun getQuestions(): ArrayList<Pregunta> {
        val listadoPreguntas = ArrayList<Pregunta>()

        val question1 = Pregunta(
            1,
            "¿Cuál es el nombre del planeta natal de Goku?",
            "Tierra",
            "Vegeta",
            "Namek",
            "Kaioshin",
            2
        )
        listadoPreguntas.add(question1)

        val question2 = Pregunta(
            1,
            "¿Cuántas Esferas del Dragón existen?",
            "6",
            "9",
            "7",
            "10",
            3
        )
        listadoPreguntas.add(question2)

        val question3 = Pregunta(
            1,
            "¿Cuál es el nombre del creador de Dragon Ball Z?",
            "Akira Toriyama",
            "Masami Kurumada",
            "Eiichiro Oda",
            "Yoshihiro Togashi",
            1
        )
        listadoPreguntas.add(question3)

        val question4 = Pregunta(
            1,
            "¿En qué saga Goku se convierte en Super Saiyajin por primera vez?",
            "Saga Saiyan",
            "Saga Namek",
            "Saga Androides",
            "Saga Buu",
            2
        )
        listadoPreguntas.add(question4)

        val question5 = Pregunta(
            1,
            "¿Cuál es el nombre del hijo mayor de Goku?",
            "Goten",
            "Trunks",
            "Pan",
            "Gohan",
            4
        )
        listadoPreguntas.add(question5)

        val question6 = Pregunta(
            1,
            "¿Cuántas veces ha muerto Goku a lo largo de toda la serie Dragon Ball Z?",
            "1",
            "2",
            "3",
            "4",
            2
        )
        listadoPreguntas.add(question6)

        val question7 = Pregunta(
            1,
            "¿Quién es el heroe de la tierra en la saga de Majin Buu?",
            "Chaos",
            "Goku",
            "Mister Satán",
            "Gohan",
            3
        )
        listadoPreguntas.add(question7)

        return listadoPreguntas
    }
}