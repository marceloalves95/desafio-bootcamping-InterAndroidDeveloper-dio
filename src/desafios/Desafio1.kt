package desafios

/**
 * @author RubioAlves
 * Created 27/06/2021 at 11:28
 */
fun main() {

    mostrarResultado()

}
fun mostrarResultado(){

    val inteiros = mutableListOf<Int>()
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()

    for (i in 1..5) {
        inteiros.add(readLine()!!.toInt())
    }

    inteiros.forEach { numero->

        if (numero%2 == 0) {
            pares.add(numero)
        }
        if (numero%2 != 0) {
            impares.add(numero)
        }
        if (numero>0) {
            positivos.add(numero)
        }
        if (numero<0) {
            negativos.add(numero)
        }

    }
    println("${pares.size} valor(es) par(es)")
    println("${impares.size} valor(es) impar(es)")
    println("${positivos.size} valor(es) positivo(s)")
    println("${negativos.size} valor(es) negativo(s)")

}