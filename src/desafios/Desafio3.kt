package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:29
 */
fun main() {

    val input = readLine()!!

    val h = input.split(" ")[0].toDouble()
    val p = input.split(" ")[1].toDouble()

    val media:Double = h.div(p)
    println(String.format("%.2f", media).replace(",","."));

}