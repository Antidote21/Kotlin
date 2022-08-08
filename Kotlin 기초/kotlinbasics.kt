package eu.tutorials.myfirstapp2

fun main(){
    // immutable variable
    //TODO: Add new functionality
    //type string
    val myName = "Frank" //var 변수는 중복 기재가 가능하다. val 변수는 다시 정해질 수 없다. 새로운 값을 변수에 못쓴다.
    //type int 32 bit
    //타입 추론은 내용으로 타입을 밝혀낸다는 것이다.
    var myAge = 31 //데이터 타입이 자동으로 정해진다. - 타입 추론

    //Integer TYPES: Byte (8 bit), Short (16bit),
    //Int (32 bit), Long (64 bit)
    val myByte: Byte = 13 //긴 숫자는 못쓴다.
    val myShort: Short = 125
    val myInt: Int = 123123123//"_"사용 가능
    val myLong: Long = 12_039_812_309_487 //"_"을 사용하여 읽을 수 있게한다.

    //Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 3.1F //F를 넣어 float으로 명확히 정해준다.
    val myDouble: Double = 3.123455234562345

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    //Characters 문자 하나를 초과할 수 없다.
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0] // 첫 번째 문자
    var lastCharInStr = myStr[myStr.length - 1] // 마지막 문자

    print("First character " + firstCharInStr)
    
    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lasstCharInStr = myStr[myStr.length-1]
    var myLength = myStr.length
    print("First character $firstCharInStr and the length of myStr is ${myStr.length}") //스트링 템플릿 표현식 또는 스트링 인터폴레이션 개념입니다
    
        //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    var a = 5.0
    var b = 3
    var resultDouble : Double
    resultDouble = a / b
    //print(resultDouble)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    //println("isEqual is $isEqual")
    //String interpolation
    val isNotEqual = 5!=5
    //println("isNotEqual is $isNotEqual")

    //println("is-5less3 ${-5<3}")
    //println("is-5LowerEqual3 ${5 <= 3}")
    //println("is-5GreaterEqual3 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}") //코드가 끝난 후에 증가
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
    
        var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1==heightPerson2){
        println("use your power technique 1337+")
    }
    else{
        println("use technique")
    }

    val age = 17

    if(age >= 30)
        println("you're over 30")

    if(age >= 21){
        println("now you may drink in the US")
    }else if(age>=18){
        println("you may vote now")
    }
    else if(age>=16){
        println("you may drive now")
    }else {
        println("you are too young")
    }

    when(age){
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else -> println("you are too young")
    }


    var name = "Denis"

    if(name == "Denis"){
        println("welcome home Denis")
    }else{
        println("who are you?")
    }
    var isRaniny = true
    if(isRaniny)
        println("It's a rainy")
    /*
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    */

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x : Any = "13.37f"
    when(x){
        is Int -> println("$x is Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is String")
        else -> println("$x is none of the above")
    }
    
    var x = 100
    while(x >= 0){
        print("$x")
        x -= 2
    }
    println("\nwhile loop is done")

    x =15
    do{
        print("$x")
        x++
    }while(x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's a comfy now")
        }
    }

    for(num in 1..10){ // Same as - for(i in 1.until(10))
        print("$num")
    }

    for(i in 1 until 10){ // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(1).step(2))
        print("$i ")
    }

    var k=0

    while(k<=10000){
        if(k==9001){
            print("IT'S OVER 9000!!!")
        }
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }

    for(i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            continue  // break //특정 조건이 맞을 때 for 루프에서 나오기 위해 키워드 break를 사용한다.
        }          // 대체로 조건을 통제할 수 없거나 랜덤인 이유 등으로 사용한다.
    }
    print("Done with the loop")

}
