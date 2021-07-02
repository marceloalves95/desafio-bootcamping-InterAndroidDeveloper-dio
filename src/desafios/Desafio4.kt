package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:29
 */
fun main() {

    val c = readLine()!!.toInt()
    var sum = 0.0
    var med = 0.0
    val t = readLine()!!
    val m = Array(12) { DoubleArray(12) }

    for (i in m.indices) {
        for (j in m.indices) {
            m[i][j] = readLine()!!.toDouble()
        }
    }
    for (k in m.indices) {
        sum += m[k][c]
    }
    for (n in m.indices){
        med = sum/m.size
    }
    if (t == "S"){
        println(sum.format(1))
    }
    if (t == "M"){
        println(med.format(1))
    }

}

private fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
