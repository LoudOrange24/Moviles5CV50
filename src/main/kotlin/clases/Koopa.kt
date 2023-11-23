package clases

class Koopa:
    Enemy("Koopa", "Fight"){
        init {
            println("Iniciando subclase de $name")
        }
    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}