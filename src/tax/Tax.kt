package tax

import java.time.DayOfWeek

fun main (args: Array<String>){
    println("Enter your salary!")
    val inputUser: String? = readLine();

    if(inputUser == null) {
        println("Null not salary!")
        return
    }

    val salary:Int = inputUser.toInt()

    val tax:Double = calcTax(salary)

    println("From salary $salary tax = $tax")

    println(calcChairs(44))
    println(calcChairs(70))
    println(calcChairs(6))
    println(calcChairs(12))

    println(calcBugMoneyValue(10, 2, 25))

    var x:Int = 4;

    when(x){
        4-> {println(7)}
        5-> println("x != 5")

        else -> println("else")
    }

    when {
        2 > 3 -> print("false")
        3==3 -> println("true")

        else -> println("else")
    }
}

fun calcTax(salary:Int): Double{
    return  salary * 0.13.toDouble()
}

fun calcChairs(bugs: Int): Int{
    val z:Int = bugs / 2
    val y:Int = bugs + z

    return y
}

fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, money: Int ) : Int{
    val curs:Int = dayNumber * bugRank + 42
    val sum = curs * money
    return sum
}