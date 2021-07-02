package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:29
 */
fun main() {

    val v = readLine()!!.toInt()
    val a = IntArray(10).toMutableList()

    for(i in 0 until a.size){
        a[i] = if(i == 0) v
        else a[i-1] * 2
    }

    for (k in 0 until a.size) {
        println("N[$k] = ${a[k]}")
    }

}