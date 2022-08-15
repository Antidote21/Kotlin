package eu.tutorials.myapplication

fun main(){
    //생성된 사람이 셋이고 생성한 클래스의 세 가지 사례인 거예요
    var denis = Person("Denis", "Panjuta") //이름과 성으로 두 값이 들어간 객체가 생성된 Person타입의 변수
    var john = Person()//기본값을 설정했으므로 John Doe가 나온다.
    var johnPeterson = Person(lastName = "Peterson")
}

//class Person // 이 자체로 유효한 코드 프로퍼티 없음 메서드도 없지만 유효한 클래스
//class Person constructor() // 보조 생성자는 객체 생성 시 값을 추가하게 해줘요
                                //여기서 값은 이름이 될 수 있죠
//class Person constructor(firstName: String, lastNmae: String) //보조 생성자의 값으로 두 가지 변수를 넣을 수 있는 거죠
                                                                //다시 말하면, 보조 생성자의 매개변수입니다

//보조 생성자는 구체적으로 정하고 싶지 않다면 필수는 아니에요(private,public)

class Person(firstName: String = "John", lastName: String = "Doe"){ //기본값 설정 John Doe

    init{ //이니셜라이저 객체가 생성되는 순간 호출되는 걸 말한다. 객체를 준비하는 과정
        println("Initialized a new Person object with " +
        "firstName = $firstName and lastName = $lastName")
    }

}
