import java.util.*
/*
An application that get a number from user and count number of digits and plus them together 

It is runable just for kotlin so if you want to run it in other program languages you have to change syntax of the code.

*/
fun main() {
    println("Enter a number !!")
    var number: Int = Scanner(System.`in`).nextInt()

    var r: Int
    var sum = 0
    var digitNumber = 0

    for (i in 1..number) {
        r = number - 10 * (number / 10)
        if (r != 0) {
            digitNumber += 1
            sum += r
        }
        number /= 10
    }
    println("Number of digits : $digitNumber \t Sum of digits : $sum")
}
