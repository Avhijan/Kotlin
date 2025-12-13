fun displayHelloWorld()
{
    println("Hello World")
}

fun displayArgument(varName: Int)
{
    println(varName)
}

fun returnArgument(varName: Int) : Int //Assign the return type using : type after the funtion and brfore the scope
{
    return varName
}

fun String.removeFirstChar() : String = this.substring(1,this.length)  //extenstion function
// here "this" is the receiver object


fun main()
{
    //basic function without return type or arguments
    displayHelloWorld()

    //function with arguments
    displayArgument(690)

    //function with return type and arguments
    var a: Int
    a = returnArgument( 5)
    displayArgument(a)

    //kotlin has a feature which allows us to extend a class with new functionalities
    //For this we use extension function
    val mystring = "Kotlin is life"
    val result = mystring.removeFirstChar()
    println(mystring)
    println(result)


}