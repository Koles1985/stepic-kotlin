package stepic.kotlin.cycles_andbranches_2_2

fun main(args: Array<String>){

    var a:String = getYearEra(1950)
    println(a)
    println("__________________")
    var b:String = getYearEra(1970)
    println(b)
    println("__________________")
    var c:String = getYearEra(1971)
    println(c)
    println("__________________")
    var d:String = getYearEra(2001)
    println(d)
    println("__________________")
    var e:String = getYearEra(2101)
    println(e)
    println("__________________")
}

fun getYearEra(year:Int):String{
    var text:String = null.toString()
    when {
        year < 1970 -> text = "before"
        year == 1970 -> text = "equals"
        year > 1970 && year <= 2000 -> text = "after (XX century)"
        year >=2001 && year <=2100 -> text =  "after (XXI century)"
        year > 2100 -> text = "distant future"
    }

    return text
}