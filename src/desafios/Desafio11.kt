package desafios

import java.util.*

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:31
 */
fun main() {

    val reader = Scanner(System.`in`).useLocale(Locale.US)

    val a = reader.nextDouble()
    val b = reader.nextDouble()

    val weightA = 3.5
    val weightB = 7.5
    val totalWeight = 11.0

    val m = (a * weightA + b * weightB) / totalWeight

    val r = "%.5f".format(m)
    val ponto = r.replace(",", ".")

    println("MEDIA = $ponto")

}