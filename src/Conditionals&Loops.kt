fun main()
{
    val exam_score = 100
    val full_marks = 100
    val pass_score = 45
    if (exam_score == full_marks) // if(case) {code block if case is true}
    {
        println("Parents are proud. :)")
    }

    else if (exam_score >=90 && exam_score<=95 ) // && = and case || = or case like in C
    {
        println("Stevan's son is better. :(")
    }

    else
    {
        println("You are a disgrace to your family. :(")
    }


    // for loops
    val names = listOf("Ram", "Hari", "Gita", "SIta")
    for (name in names)
    {
        println(name)
    }

    for (i in 1..5) //to execute a code block exactly 5 times (i<=5)
    {
        println(i)
    }

    for( j in 1 until 5) // to execute until 5-1  (j < 5)
    {
        println(j)
    }


    //while loops
    var count = 0
    while (count <= 5) {
        println("Count is: $count")
        count++
    }


    //do while loops
    var k = 0
    do {
        // This code executes at least once
        println("The value of k is: $k")
        k++
    } while (k < 5)

    // we can use break to exit the loop entirely if needed

}