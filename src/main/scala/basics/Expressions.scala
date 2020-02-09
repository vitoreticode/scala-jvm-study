package basics

object Expressions extends App {

    val x = 1 + 2
    println(x)

    println(2 + 3 * 4)
    // + - * / & | ^ << >> >>>

    println(1 == x)
    // == != > >= < <=

    println(!(1 == x))

    var aVar = 2
    aVar += 3 // also works with -= *= /= .... side effects
    println(aVar)

    // Instructions (DO) vs Expressions (VALUE)

    // IF EXPRESSION
    val aCondition: Boolean = true
    val aConditionValue = if(aCondition) 5 else 3
    println(aConditionValue)
    println(if(aCondition) 5 else 3)

    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    // NEVER WRITE THE CODE BELOW AGAIN

    // Everything in scala is an Expression!

    val aWeirdValue = (aVar = 3) // Unit === Void
    println(aWeirdValue)

    // side effects: println(), whiles, reassigning

    // code blocks

    val aCodeBlock = {
        val y = 2
        val z = y + 1
        if (z > 2) "Hello" else "Goodbye"
    } // the value of the block is the value of the last expression

    // val anotherValue = z + 1 // z does not exist outside of the codeblock

    // Instructions are executed, expressions are evaluated
    // In scala we think in expressions and vals
    // Do not use while loops in scala

    // 1. difference between "hello world" vs println("hello world"?
    // 2. whats the difference of both codes down:

    // code 1
    val someValue = {
        2 < 3
    }
    println(someValue)

    val someOtherValue = {
        if (someValue) 239 else 986
        42
    }
    println(someOtherValue)


}
