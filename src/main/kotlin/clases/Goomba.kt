package clases

open class Goomba(name: String, strenght: Int, state: String):
    Enemy("Masiosare", "Fight") {
        init {
            println("Iniciando subclase de $name")
        }
}