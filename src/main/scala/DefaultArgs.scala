object DefaultArgs extends App {

    def trFact(n: Int, acc: Int = 1): Int =
        if (n <= 1) acc
        else trFact(n - 1, n * acc)

    val fact10 = trFact(10, 2) // can change de default param
    println(fact10)

    def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture...")
    savePicture(width=800)
    savePicture()
    savePicture("png")
    savePicture(width = 100, format = "png")

    /*
        1. pass in every leading arg
        2. name the arguments
            2.1 pass named args in any order
    */

}
