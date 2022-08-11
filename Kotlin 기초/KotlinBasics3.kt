package eu.tutorials.myapplication

fun main(){

    //var name : String = "Denis"
    //name = null -> Compilation ERROR
    var nullableName : String? = "Denis"
    //nullableName = null

    //var len = name.length
    var len2 = nullableName?.length

    nullableName?.let {println(it.length)}

    // ?: Elvis operator 엘비스 연산자
    val name = nullableName ?: "Guest"
    //println("name is $name")

    println(nullableName!!.toLowerCase())

    //val wifrsAge: String? = user?.wife?.age ?: 0
    // 구식 방법
    /*
    if(nullaableName != null){
        var len2 = nullaableName.length
    }else{
        null
    }*/





}
