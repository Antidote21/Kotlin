package eu.tutorials.myapplication
// 함수의 장점 코드 재사용
// 다른 사람과의 작업

fun main(){
    // argument 인수
    var avg = avg(5.3,13.37)
    print("result is $avg")
}
fun avg(a: Double, b:Double) : Double{
    return (a+b)/2
}
// Method 메서드 클래스 안의 함수
// Parameter 매개변수 (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a+b
}

//코틀린 사전
fun myFunction(){
    print("Called from myFunction")
}
