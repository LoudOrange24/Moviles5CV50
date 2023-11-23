package clases

class Phone {
    //Atributos
    var isOn = false
    lateinit var model: String
    //metodos
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun getTurn(){
        val turnMode=if (isOn)"encendido" else "apagado"
        println("el telefono esta $turnMode")
    }
}