package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:31
 */
fun main() {

    var sum = 0.0
    val t = readLine()!!
    val m = Array(12) { DoubleArray(12) }

    for (i in m.indices) {
        for (j in m.indices) {
            m[i][j] = readLine()!!.toDouble()
            if (j>i) sum += m[i][j]
        }
    }

    if (t == "S"){
        println(sum.format(1))
    }
    if (t == "M"){
        sum /= 66.0
        println(sum.format(1))
    }

}

private fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')