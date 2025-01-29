package stepic.kotlin.cycles_andbranches_2_2_6

import com.sun.jdi.IntegerType
import com.sun.jdi.IntegerValue

fun main(args: Array<String>){

    fun calculateEvenDigit(input: String): Int{
        var count:Int = 0
        if(input != null){
            for(c in input){
                var i: Int = c.digitToInt()
                if(i % 2 == 0){
                    count += i;
                }
            }
        }
        return count
    }

    println(calculateEvenDigit("1234567890"))
}