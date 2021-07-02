package desafios

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:30
 */
fun main() {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * (raio*raio)
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)

    println("A=$resultado")

}