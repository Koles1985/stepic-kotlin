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

   // println(calculateEvenDigit("1234567890"))

   val words = arrayOf("KLPQYM", "BUG", "KHQR", "KLPQYM", "JVOJTD", "JVOJTD", "BUG", "BUG", "KHQR", "BUG",
       "KLPQYM", "JVOJTD", "KLPQYM", "JVOJTD", "QLSPA", "KHQR", "JVOJTD", "KLPQYM", "JVOJTD", "KLPQYM",
       "KLPQYM", "JVOJTD", "JVOJTD", "BUG", "KLPQYM", "KHQR", "JVOJTD", "KHQR", "KLPQYM", "KLPQYM", "JVOJTD",
       "KLPQYM", "BUG", "BUG", "BUG")

    var i: Int = 0
    for(word in words){
        if(word.equals("BUG")){
            i++
        }
    }

    println(i)
}