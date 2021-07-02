package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:30
 */
fun main() {

    val list = IntArray(10) { readLine()!!.toInt() }
    for (x in list.indices) {
        if (list[x] <=0) list[x] = 1
    }
    for (i in list.indices) println("X[$i] = ${list[i]}")

}