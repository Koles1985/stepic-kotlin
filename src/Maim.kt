fun main(args: Array<String>) {
//    val name: String? = readLine()
//    val message = "Oh mighty ruler of Bug Kingdom, the earthling called $name seeks for your wisdom!"
//    println(message)

    var x:Int = 0
    while(x < 10){
        println(x)
        x++
    }

    println("____________________")

    do{
        var y:Int = 0
        println(y)
    }while(y > 0)

    println("________for(i:Int in 0..5)____________")

    for(i:Int in 0..5){
        println(i)
    }

    println("__________for(i:Int in 0..8 step 2)__________")
    for(i:Int in 0..8 step 2){
        print(i)
    }

    println("_________for(i:Int in 10 downTo 4)___________")

    for(i:Int in 10 downTo 4){
        println(i)
    }
    println("_________for(i:Int in 0 until 7)___________")
    for(i:Int in 0 until 7){
        println(i)
    }

}