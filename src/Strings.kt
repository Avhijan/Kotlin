fun main()
{
    val mystring = "Kotlin is fun" // defined using ""
    // .toString() can be used to convert some other type to string type

    //strings can be indexed to get specific characters
    println(mystring[0]) // prints the first character 'K'

    // string has lots of in-built functions
    println(mystring.isEmpty()) //returns true if empty
    println(mystring.isNotEmpty()) //returns true if not empty

    println(mystring.uppercase()) //returns the string in uppercase
    println(mystring.lowercase()) //returns the string in lowercase

    println(mystring.length) //returns length of the string

    //substring allows us to take a part of the string
    // string_name.substring( starting_index, end_index) shows up to (end_index - 1)
    println(mystring.substring(0,6))

    //we can also compare between the strings
    println(mystring == "Kotlin is fun") //preferred over java's equals()
    println(mystring.equals("kotlin is fun", ignoreCase = true)) //comparison with ignore case

    //furthermore we can compare the inner content using contains, startsWith, endsWith
    println(mystring.startsWith("Kotlin")) //returns true because string starts with kotlin
    println(mystring.endsWith("fun"))
    println(mystring.contains("I Love you")) //false because the string doesn't contain "I love you"


    // we can use $ sign for string interpolation
    val your_value ="priceless"
    print("You are $your_value.")

}