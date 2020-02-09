package basics

object Functions extends App {

    def aFunction (a: String, b: Int): String = {
        a + " " + b
    }
    println(aFunction("hello", 3))

    def aParameterLessFunction(): Int = 42
    println(aParameterLessFunction())
    println(aParameterLessFunction())

    println(aFunction("Oi", aParameterLessFunction()))

    def aRepeatedFunction(a: String, b: Int): String = {
        if (b == 1) a
        else a + aRepeatedFunction(a, b - 1)
    }

    print(aRepeatedFunction("Hello\n", 3))

    // WHEN YOU NEED LOOPS, USE RECURSION.
    // DO NOT USE IMPERATIVE CODE IN A FUNCTIONAL STYLE PROGRAMMING

    def aFunctionWithSideEffects(aString: String): Unit = println(aString)
    aFunctionWithSideEffects("Lucas")

    def aBigFunction(n: Int): Int = {
        def aSmallFunction(a: Int, b: Int): Int = a + b
        aSmallFunction(n, n-1)
    }
    println(aBigFunction(10))

    /*
        1. A greeting function (name, age)
        2. A Factorial function 1 * 2 * 3 * ... * n
        3. A Fibonacci function
            f(1) = 1
            f(2) = 1
            f(n) = f(n-1) + f(n-2)
        4. Is a number prime function
    */


    // func 1
    def greeting(name: String, age: Int): Unit = {
        println("Hello my name is " + name + " and I have " + age + " years old.")
    }
    greeting("Lucas", 25)

    // func 2
    def factorial(n: Int): Int = {
        if (n <= 0 ) 1
        else n * factorial(n - 1)
    }
    println(factorial(3))

    // func 3
    def fibonacci(n: Int): Int = {
        if ( n <= 2 ) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }
    println(fibonacci(8))

    def isPrime(n: Int): Boolean = {
        def isPrimeUntil(t: Int): Boolean =
            if( t <= 1 ) true
            else n % t != 0 && isPrimeUntil(t -1)
        isPrimeUntil(n / 2)
    }
    println(isPrime(37))
    println(isPrime(2003))
    println(isPrime(37 * 17))

}
