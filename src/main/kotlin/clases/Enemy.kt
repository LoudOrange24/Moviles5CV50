package clases

open class Enemy(val name: String, var state: String) {
    init {
        println("Iniciando superclase de $name")
    }
    private var direction: String = "LEFT" //la direccion hacia donde camina un enemigo

    protected fun changeDirection(){ //Cambiar el senti do de movimiento al contrario
        direction = if (direction=="RIGHT") "LEFT" else "RIGHT"
        println("$name va en direccion $direction")
    }

    private fun die(){ //indicamos al jugador que nuestro enemigo ha muerto
        println("$name ha muerto")
    }

    open fun collision(collider: String){ //decidir que accion ejecurar dependence del objeto con que se colisiona
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}