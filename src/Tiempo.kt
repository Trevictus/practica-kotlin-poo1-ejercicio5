class Tiempo(var horas: Int, var minutos: Int, var segundos: Int) {



    init{



        require(horas in 0..24){"Las hora debe estar entre 0 y 24."}
        require(minutos > 0){"Los minutos deben ser un nº positivo entero."}
        require(segundos > 0){"Los segundos deben ser un nº positivo entero."}
    }

    constructor(horas: Int): this(horas, minutos = 0, segundos = 0)

    constructor(horas: Int, minutos: Int): this(horas, minutos, segundos = 0)

    override fun toString(): String {
        return "${horas}h:${minutos}m:${segundos}s"
    }
}