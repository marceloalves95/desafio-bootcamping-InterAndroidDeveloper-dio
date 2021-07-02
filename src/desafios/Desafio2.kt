package desafios

import java.util.*

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:29
 */
fun main() {

    val leitor = Scanner(System.`in`).useLocale(Locale.US)

    val x = leitor.nextInt()
    val y = leitor.nextFloat()
    val media = x.div(y)

    println(String.format("%.3f km/l", media).replace(",","."))

}