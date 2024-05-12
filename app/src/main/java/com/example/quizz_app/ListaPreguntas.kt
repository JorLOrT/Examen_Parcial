package com.example.quizz_app

object ListaPreguntas{
    fun getQuestions(): ArrayList<Pregunta> {
        val listadoPreguntas = ArrayList<Pregunta>()

        val question1 = Pregunta(
            "¿Cuál es el nombre del planeta natal de Goku?",
            "Tierra",
            "Vegeta",
            "Namek",
            "Kaioshin",
            2,
            "Si bien Goku pasó la mayor parte de su infancia en la Tierra, su planeta natal original es Vegeta, un mundo destruido por Freezer."
        )
        listadoPreguntas.add(question1)

        val question2 = Pregunta(
            "¿Cuántas Esferas del Dragón existen?",
            "6",
            "9",
            "7",
            "10",
            3,
            "En la Tierra existen 7 Esferas del Dragón, las cuales al ser reunidas permiten invocar a Shenlong para conceder un deseo."
        )
        listadoPreguntas.add(question2)

        val question3 = Pregunta(
            "¿Cuál es el nombre del creador de Dragon Ball Z?",
            "Akira Toriyama",
            "Masami Kurumada",
            "Eiichiro Oda",
            "Yoshihiro Togashi",
            1,
            "Dragon Ball Z fue creado por el mangaka japonés Akira Toriyama, reconocido por su estilo artístico y sus historias llenas de acción y aventura."
        )
        listadoPreguntas.add(question3)

        val question4 = Pregunta(
            "¿En qué saga Goku se convierte en Super Saiyajin por primera vez?",
            "Saga Saiyan",
            "Saga Namek",
            "Saga Androides",
            "Saga Buu",
            2,
            "La primera transformación de Goku en Super Saiyajin ocurre durante la batalla contra Freezer en la Saga Namek, un momento crucial que marca un hito en la serie."
        )
        listadoPreguntas.add(question4)

        val question5 = Pregunta(
            "¿Cuál es el nombre del hijo mayor de Goku?",
            "Goten",
            "Trunks",
            "Pan",
            "Gohan",
            4,
            "Gohan es el primer hijo de Goku y Chi-Chi, un personaje que juega un papel fundamental en la historia, especialmente en la Saga Cell y la Saga Buu."
        )
        listadoPreguntas.add(question5)

        val question6 = Pregunta(
            "¿Cuántas veces ha muerto Goku a lo largo de toda la serie Dragon Ball Z?",
            "1",
            "2",
            "3",
            "4",
            2,
            "A pesar de las múltiples batallas y situaciones peligrosas que enfrenta, Goku solo muere dos veces de forma canónica en Dragon Ball Z: a manos de Raditz y durante la Saga Cell."
        )
        listadoPreguntas.add(question6)

        val question7 = Pregunta(
            "¿Quién es el heroe de la tierra en la saga de Majin Buu?",
            "Chaos",
            "Goku",
            "Mister Satán",
            "Gohan",
            3,
            "Si bien Goku tiene un papel importante en la derrota de Majin Buu, es Mister Satán quien finalmente es reconocido como el héroe de la Tierra en esta saga."
        )
        listadoPreguntas.add(question7)

        return listadoPreguntas
    }
}