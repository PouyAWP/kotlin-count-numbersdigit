import java.util.*

fun main() {

    println("<-Make a choice--->")

    println("<-------K-C--------->")

    println("Kelvin ---> Celsius")
    val kToC = Scanner(System.`in`).next()

    if (kToC.contains("y", true) || kToC.contains("yes", true)) {
        println("Enter your kelvin number : ")
        val kelvin = Scanner(System.`in`).nextInt()

        println("Formula is : k - 273 = c")
        println("----------Result----------")
        println("$kelvin - 273 = ${celsius(kelvin)}")
        println("Good luck !")


    }

    println("<-------C-K--------->")

    println("Celsius ---> Kelvin")
    val cToK = Scanner(System.`in`).next()


    if (cToK.contains("y", true) || cToK.contains("yes", true)) {
        println("Enter your Celsius number : ")
        val celsius = Scanner(System.`in`).nextInt()

        println("Formula is : c + 273 = k")
        println("----------Result----------")
        println("$celsius + 273 = ${kelvin(celsius)}")
        println("Good luck !")
    }

}


fun kelvin(celsius: Int): Int {

    return celsius + 273
}

fun celsius(kelvin: Int): Int {

    return kelvin - 273 // k - 273 = c

}
