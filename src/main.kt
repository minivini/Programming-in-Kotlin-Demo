fun main(args: Array<String>) {
    val temperature = 37.5
    val count : Int = 5
    var name = "Sam"

    name = "Fred"

    fun calculateTemperature(celsius: Double) : Double {
        return  9/5 * celsius + 32
    }

    println("Temp = ${calculateTemperature(20.0)}")
    println("Temp = ${calculateTemperature(50.0)}")

    val intValue = "32".toInt()
    println("inValue = $intValue")

    val intString = 32.toString()
    println("intString = $intString")

    val fahrenheit = 32
    when (fahrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("Getting colder")
        in 41..50 -> println("Kind of cold")
        in 51..60 -> println("Nippy")
        in 71..80 -> println("Just right")
    }

    var nullableName : String? = null
    var length = nullableName?.length ?: -1
    println(length)
    nullableName = "Sam"
    length = nullableName?.length ?: -1
    println(length)


    // Kotlin Basics (1.4)
    println("*****************")

    // This a comment. It is not executed

    // This is also a comment.
    // Over multiple lines

    /* This is a comment.
       Over many..
       many..
       manu lines..
     */

    /* This is a comment.

    /* And inside it is another comment.

     */

     * Back to the first,
     */

    // Pair and Triple (1.5)
    println("*****************")
    val coordinates = Pair(2,3)
    val (x,y) = coordinates
    println("x = $x y = $y")

    println("x = ${coordinates.first} y = ${coordinates.second}")

    val coordinatesDoubles = Pair(2.1, 3.5)
    println("x = ${coordinatesDoubles.first} y = ${coordinatesDoubles.second}")

    val coordinatesMixed = Pair(2.1, 3)
    println("x = ${coordinatesMixed.first} y = ${coordinatesMixed.second}")

    val x1 = coordinates.first
    val y1 = coordinates.second
    println("x = ${x1} y = ${y1}")

    val coordinates3D = Triple(2,3,1)
    val (x3, y3, z3) = coordinates3D
    println("x = ${x3} y = ${y3} z = $z3")

    val (x4, y4, _) = coordinates3D
    println("x4 = $x4 y4 = $y4")
}

/**
 *
 */
fun Challenge_Pair_and_Triple_1_6(args: Array<String>) {
/* Pairs and Triples

 Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
 */

/*
 In one line, read the day and month values into two constants.
 */


/*
 Now create a Triple using the month, day and year */

}