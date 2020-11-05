import java.util.*

fun main() {

    println("Enter a number")
    val number: Int = Scanner(System.`in`).nextInt()
    var r : Int
    var sum = 0

    for (i in 2..number) {
        r = number - i * (number / i)

        if (r == 0) {
            sum += 1
        }
    }
    if (sum == 1) println("It is prime") else println("It is not prime")

}