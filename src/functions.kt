fun displayHelloWorld()
{
    println("Hello World")
}

fun displayArgument(varName: Int)
{
    println(varName)
}

fun returnArgument(varName: Int) : Int //Assign the return type using : type after the function and before the scope
{
    return varName
}

fun String.removeFirstChar() : String = this.substring(1,this.length)  //extension function
// here "this" is the receiver object


//
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int
{
    return operation(a, b)
}
fun add(x: Int, y: Int) = x + y


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
    val myString = "Kotlin is life"
    val result = myString.removeFirstChar()
    println(myString)
    println(result)


    //Higher Order Functions
    //takes one or more functions as arguments or returns a function
    val sum = calculate(10, 5, ::add)
    println("Sum: $sum")


    //Function literals
    //It is not declared but is immediately passed as an expression
    //lambda is the most common Syntax: { parameter -> body }

    // val difference = calculate(10, 5, { x, y -> x - y }) This will work but below is better syntax common in kotlin

    // here we sent function argument in parentheses after other arguments:-
    val difference = calculate(10, 5, { x, y -> x - y })
    println("Difference: $difference")

    //Passing a lambda in HOF will create an extra object in memory
    //Instead we use Inline keyword.
    //This tells compiler to replace the function site with function code block.



}