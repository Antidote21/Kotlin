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


}
