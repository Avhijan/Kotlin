// To define a class we use "class" keyword
// Syntax: class className( define constructors here) { --code block--}

class Animal(name : String ,  sound: String)
{
    val AnimalName: String = name
    var AnimalSound:String = sound

    init// Initializer block that runs when class is being created
    {
        println("Building animal")
    }

    fun AnimalSays()  // createing public funcitons
    {
        println(" $AnimalName says $AnimalSound.")

    }
}


fun main()
{
    val Pigeon = Animal ("Pigeon","Coo")  // creating object with two constructors
    Pigeon.AnimalSays()                                   // Accessing Public Class Functions with "."
    val Dog = Animal ("Best Friend","arf! arf!")
    Dog.AnimalSays()

    val Human = Animal("Human", "'I hate life'")
    Human.AnimalSays()

    println("After reassigning sound")
    Human.AnimalSound = "'I love life <3'"
    Human.AnimalSays()
}