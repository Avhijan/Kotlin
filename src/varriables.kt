import kotlin.reflect.typeOf

fun main(){
    //This is a  comment

    // We use "val" keyword before var_name to declare variables
    // Kotlin is statically typed so declare type after var_name
    // Syntax: val var_name: type = value
    //val keyword is used for variables which are read only/immutable
    val a: Int=5
    println("a=$a")

    //Here explicitly giving declaring the type is unnecessary
    // Type inference allows the compiler to determine the type directly
    //so we don't need "Int"
    val b=10
    println("b=$b")

    //However for variables where we don't directly the value we need statically declare types
    //var keyword is for mutable variables
    var sum : Int
    sum = a + b
    println("sum = $sum")

    //numeric types
    val i : Byte = 127 //8-bits
    val j : Short = 32767 //16-bits
    val k : Int = 2147483647 //32-bits
    val l : Long = 9223372036854775807 // 64- bits

    val m : Float = 2.35f //32-bits
    val n : Double = 3.14 //64-bits

    //others
    val o : Boolean = true
    val p : Char = 'a'
    val q : String = " Why ? "

    //collection type
    val numbers : Array<Int> = arrayOf(1,2,3,4,5,6) // same data type, static size, mutable
    val names : ArrayList<String> = arrayListOf("Abhijan", "Ram", "Hari") // same data type, dynamic size, mutable

    val my_list : List<Char> = listOf('a','b','c') //same data type, dynamic size, immutable
    val changing_list : MutableList<Double> = mutableListOf(2.3,2.5,3.4) //same data type, dynamic size, mutable





}