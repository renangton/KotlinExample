package chapter3

import java.time.LocalDateTime
import java.util.*

data class Time(val time: LocalDateTime)

fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1, num2))
}

fun main() {
    val hello = HelloByJava()
    hello.printHello()

    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    val now = Time(LocalDateTime.now())
    println(now.time)

    val dog = DogKotlin()
    dog.cry()
    val pien = AnimalJava()
    pien.cry()
    val greeter = GreeterImplKotlin()
    greeter.hello()

    val user = UserJava()
    user.id = 100
    user.name = "Sugimoto"
    println(user.id)
    println(user.name)

//    val function = CalcJava { num1, num2 -> num1 + num2 }
//    println(function.calc(1, 3))
    executeCalc(1, 3, CalcJava { num1, num2 -> num1 + num2 })
}
