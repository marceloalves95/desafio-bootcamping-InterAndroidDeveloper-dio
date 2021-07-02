package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:30
 */
fun main() {

    val n = readLine()!!.toInt()
    fibonacci(n)

}
val fibonacci:(Int) -> Unit = { numero->

    var a = 1
    var b = 0
    var soma: Int
    val lista:MutableList<String> = mutableListOf("0")
    lista.add(" ")

    for (i in 0 until numero-1){

        lista.add(a.toString())
        lista.add(" ")

        soma = a
        a += b
        b = soma

    }
    lista.forEach { numeros-> print(numeros) }
}

