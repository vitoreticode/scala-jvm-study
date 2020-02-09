package basics

object ValuesVariablesTypes extends App {

    // VALS ARE IMMUTABLE
    // COMPILE CAN INFER TYPES
    // SEMI COLON NOT REQUIRED
    // PREFER VALS OVER VARS
    // ALL VALS AND VARS HAVE TYPES

    val x: Int = 42;
    println(x)

    val aString: String = "Hello"
    println(aString)

    val aBool: Boolean = false
    val sChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 4613
    val aLong: Long = 1234567890123456789L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14

    // variables
    var aVar: Int = 4
    println(aVar)
    aVar = 5
    println(aVar)

}
