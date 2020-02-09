package basics

import scala.annotation.tailrec

object Recursion extends App {


    def factorial(n: Int): BigInt = {
        if (n <= 0 ) 1
        else n * factorial(n - 1)
    }
    // println(factorial(20000))

    def anotherFactorial(n: Int): BigInt = {
        @tailrec
        def factHelper(x: Int, accumulator: BigInt): BigInt =
            if (x <= 1) accumulator
            else factHelper(x - 1, x * accumulator)

        factHelper(n, 1)
    }
    println(anotherFactorial(20000))

    def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
        if (n <= 0) accumulator
        else concatenateTailRec(aString, n-1, aString + accumulator)
    println(concatenateTailRec("Te amo muito\n",100," "))

    def isPrime(n: Int): Boolean = {
        def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
            if(!isStillPrime) false
            else if (t <= 1) true
            else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
        isPrimeTailRec(n / 2, true)
    }
    println(isPrime(2003))
    println(isPrime(629))

    def fibonacci(n: Int): Int = {
        def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int =
            if(i >= n) last
            else fibonacciTailRec(i + 1, last + nextToLast, last)
        if (n <= 2) 1
        else fibonacciTailRec(2,1,1)
    }
    println(fibonacci(8))



}
