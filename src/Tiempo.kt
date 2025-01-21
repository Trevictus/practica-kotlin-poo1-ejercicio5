class Tiempo(var horas: Int, var minutos: Int, var segundos: Int) {



    init{



        require(horas in 0..24){"Las hora debe estar entre 0 y 24."}
        require(minutos >= 0){"Los minutos deben ser un nº positivo entero."}
        require(segundos >= 0){"Los segundos deben ser un nº positivo entero."}
    }

    constructor(horas: Int): this(horas, minutos = 0, segundos = 0)

    constructor(horas: Int, minutos: Int): this(horas, minutos, segundos = 0)

/*
*
*
* hacer el calculo de los minutos segundos en el init*/
    fun pedirValor(msj: String, aceptaVacio: Boolean = true): Int {
        var valor: Int? = null

        do {
            print(msj)
            val entrada = readln().trim()
            if (aceptaVacio && entrada.isEmpty()) {
                valor = 0
            } else {
                try {
                    valor = entrada.toInt()
                } catch (e: NumberFormatException) {
                    println("Introduce un valor numérico entero o vacío.")
                }
            }
        } while (valor == null)
        return valor
    }


//    fun preguntarValidarHora(): Int {
//        println("Introduce la hora: ")
//        val hora = readln().toInt()
//        this.horas = hora
//        return horas
//    }
//
//    fun preguntarValidarMinutos(): Int {
//        try {
//            println("Introduce los minutos: ")
//            val mins = readln().toInt()
//            if(mins >= 60) {
//                minutos -= 60
//                horas++
//                this.minutos = mins
//
//            }
//
//        }catch (e: IllegalArgumentException){
//            print("ERROR")
//        }
//        return minutos
//    }
//
//    fun preguntarValidarSegundos(): Int {
//        try {
//            println("Introduce los segundos: ")
//            val secs = readln().toInt()
//            if(secs >= 60){
//                segundos -= 60
//                minutos ++
//                this.segundos = secs
//            }
//
//        }catch (e: IllegalArgumentException){
//            println("ERROR")
//        }
//            return segundos
//    }

    override fun toString(): String {
        return "${"%02d".format(horas)}h:${minutos}m:${segundos}s"
    }
}