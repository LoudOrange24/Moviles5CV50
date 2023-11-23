import clases.*

fun main() {
    /*
    //Actividad Mario y enemigos
    var mario = Mario()
    mario.collision("Pipe")
    mario.collision("Goomba")
    for (i in 1..5){
        if (mario.isAlive){
            mario.collision("Goomba")
            println("Te quedan ${mario.getLives()}")
        }
    }
    val enemy = Goomba("Masiosare",2,"Fight")
    val koopa = Koopa()
    koopa.collision("Weapon")
    */

    //National
    /*
    val viajeMonterrey = National("Monterrey")
        viajeMonterrey.quotePrice(2)
        viajeMonterrey.reserve(4)

    //NationalLowSeason
    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
    viajeBajaMonterrey.reserve(4)
     */

    /*
    //Movie
    val scaryMovie = Movie("Sacary Movie", "Comedia", 88.27)
    println(scaryMovie)
    println(scaryMovie.name)
    scaryMovie.createdAt = "2000"
    println("Fecha de creacion: ${scaryMovie.createdAt}")
    println(scaryMovie.component2())
    val(namedeS,genderdeS,durationdeS) = scaryMovie
    println("Duracion: $durationdeS Name: $namedeS Genero: ${scaryMovie.gender}")

    val scaryMovie2 = scaryMovie.copy(name= "Scary movie 2", duration = 83.0)
    println("""
        Scary movie: $scaryMovie
        Scary movie 2: $scaryMovie2
        """.trimIndent())
    */

    /*
    //Lambda
    var suma = {a:Int, b:Int -> a+b}
    println(suma(5,6))

    val saverGrade: (Double,Double) -> String = {expected: Double, saved: Double ->
        val percentage = saved / expected
        when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade(120.00,130.00))
    //Funciones anonimas
    val saverGrade2 = fun(expected:Double, saved:Double): String{
        val percentage = saved/expected

        return when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade(120.0,130.0))
    */
    //Higer Order Functions
    fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    //Funciones
    fun suma(a: Int, b: Int) = a + b
    fun resta(a: Int, b: Int) = a - b
    fun multiplicar(a: Int, b: Int) = a * b
    fun dividir(a: Int, b: Int) = a / b
    //Llamando a la Higer Order Functions
    println(calculadora(5, 4, ::suma))
    println(calculadora(5, 4, ::resta))
    println(calculadora(5, 4, ::multiplicar))
    println(calculadora(5, 4, ::dividir))

    //Ejercicio
    val precioProducto = 1500.0 // Puedes cambiar este valor o solicitarlo al usuario

    fun calcularPrecioTotal(conPrecio: (Double) -> Double) {
        val precioConImpuestos = conPrecio(precioProducto)
        println("Total a pagar: $precioConImpuestos")
    }

    val cupon = "PROMO2020" // Puedes cambiar el cupón o solicitarlo al usuario

    when (cupon) {
        "NOIVA" -> {
            calcularPrecioTotal { it }
        }

        "HALFIVA" -> {
            calcularPrecioTotal { it * 1.08 }
        }

        "MINUS100" -> {
            calcularPrecioTotal { it - 100 }
        }

        "PROMO2020" -> {
            when {
                precioProducto <= 1000 -> {
                    calcularPrecioTotal { it * 1.12 }
                }

                precioProducto <= 2000 -> {
                    calcularPrecioTotal { it * 1.04 }
                }

                precioProducto <= 4000 -> {
                    calcularPrecioTotal { it * 0.67 }
                }

                else -> {
                    calcularPrecioTotal { it }
                }
            }
        }

        else -> {
            calcularPrecioTotal { it * 1.08 } // Cupón inválido (IVA incluido)
        }
    }
}