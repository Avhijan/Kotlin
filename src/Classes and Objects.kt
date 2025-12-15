// To define a class we use "class" keyword
// Syntax: class className( define constructors here) { --code block--}



class Animal(name : String ,  sound: String) //this is a normal class
{
    val AnimalName: String = name
    var AnimalSound:String = sound

    init // Initializer block that runs when class is being created
    {
        // println("Building animal")
    }

    fun AnimalSays()  // creating public functions
    {
        println(" $AnimalName says $AnimalSound.")

    }
}


// data keyword is used to define data class
// used to bundle similar types of data
data class Person (val name : String)
{
    var personName : String = name
}

//singleton classes


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



    println("------------------------------------------------")
    println("Normal Classes")
    //used for classes where functionalities are important
    //can use complex data types
    //isn't used for bundling data and has a lot of functions


    //Comparing normal classes will not compare the content but the address
    println("Comparing two instances with same content and same address")
    val cat1 =Animal("Cat","meow")
    val cat2 =Animal("Cat","meow")  // same arguments passed for cat1 and cat2
    println(cat1 == cat2) //comparing instances with the same contents

    // if instances of normal classes have same address in memory comparison will return true
    println("Comparing two instances with different content but same address")
    val Humans = Animal("John" , "Hi")
    val Human_copy = Humans
    Human_copy.AnimalSound = "Yay"
    println(Humans ==  Human_copy)


    println("------------------------------------------------")
    println("Data Classes")
    // Main Use is to bundle data
    // has a lot of primitive data types
    // generally don't need a lot of functions

    //instances of data classes are compared based on content unlike normal classes
    val person1 = Person("Sita")
    val person2 = Person( name = "Hari")
    println("comparison between two instances with different content and different address")
    println(person1 == person2)

    val person3 = Person("Sita")
    println("comparison between two instances with same content and different address")
    println(person1 == person3)// return truee

    //copy function can be used to create copies of an instance
    // features that need to be changed can be changed in the brackets
    // Syntax: val personCopy = person1.copy( // change specific parts here)

}