package chapter2

import chapter2.dele.*
import chapter2.overload.Num
import chapter2.user.*
import kotlinx.coroutines.*

fun main() {
    val number = PrintOddOrEvenNumberText()
    number.printOddOrEvenNumberText(10)

    val number2 = PrintOddOrEvenNumberText()
    number2.printOddOrEvenNumberText2(3)

    val number3 = PrintOddOrEvenNumberText()
    number3.printOddOrEvenNumberText3(100)

    val numberText = PrintOddOrEvenNumberText()
    println(numberText.getOddOrEvenNumberText(99))

    val printText = PrintOddOrEvenNumberText()
    printText.printNumText(200)

    val user = User1()
    user.name = "Sugimoto"
    println(user.name)

    val user2 = User2(1)
    user2.name = "Tanaka"
    println("${user2.id} + ${user2.name}")

    val user3 = User3()
    user3.name = "Suetsugu"
    println(user3.name)

    val user4 = User4()
    user4.name = ""
    println(user4.isValidname)

    val user5 = User5()
    user5.name = ""
    println(user5.name)
    user5.name = "Tamura"
    println(user5.name)

    val userA = User6()
    val userB = User6()
    println(userA.toString())
    println(userB.toString())
    println(userA.hashCode())
    println(userB.hashCode())
    println(userA == userB)
    val set = hashSetOf(userA)
    println(set.contains(userB))

    val user7 = User7(1, "Tanaka")
    val user7Same = User7(1, "Tanaka")
    val user7Other = User7(2, "Tanaka")
    println(user7 == user7Same)
    println(user7 == user7Other)
    println("user = ${user7.hashCode()}")
    println("same = ${user7Same.hashCode()}")
    println("other = ${user7Other.hashCode()}")
    val set7 = hashSetOf(user7)
    println(set7.contains(user7Same))
    println(set7.contains(user7Other))
    println(user7.toString())
    println(user7.component1())
    println(user7.component2())
    val updated = user7.copy(1, "Kotlin")
    println(updated.toString())
    val user7Blank = User7(2, "")
    println(user7Blank.isValidName)
    println(user7.isValidName)

    DefaultArgument().printUserInfo(2)
    DefaultArgument().printUserInfo(1, "hoge")

    val user8 = User8(1)
    println(user8.toString())

    val user9 = User9(id = 3, age = 39)
    println(user9.toString())

    val calc: (Int, Int, Int) -> Int = { num1: Int, num2: Int, num3: Int -> num1 + num2 + num3 }
    println(calc(2, 4, 10))

    val squared: (Int) -> Int = { it * it }
    println(squared(3))

    val squared2: (Int) -> Int = fun(num: Int): Int { return num * num }
    println(squared2(2))

    fun printCalcResult(num1: Int, num2: Int, calc: (Int, Int) -> Int) {
        val result = calc(num1, num2)
        println(result)
    }
    printCalcResult(10, 20) { num1, num2 -> num1 + num2 }
    printCalcResult(10, 20) { num1, num2 -> num1 * num2 }

    fun printAdditionalResult(x: Int, y: Int) {
        println("足し算")
        printCalcResult(x, y) { num1, num2 -> num1 + num2 }
    }
    printAdditionalResult(2, 3)
    fun printMultiplicationResult(x: Int, y: Int) {
        println("掛け算")
        printCalcResult(x, y) { num1, num2 -> num1 * num2 }
    }
    printMultiplicationResult(4, 2)

    fun printCalcResultAlias(num1: Int, num2: Int, calc: Calc) {
        val result = calc(num1, num2)
        println(result)
    }
    printCalcResultAlias(10, 20) { num1, num2 -> num1 + num2 }
    printCalcResultAlias(10, 20) { num1, num2 -> num1 * num2 }

    println(spuare(2))
    println(3.square())

    val list = mutableListOf<Int>()
    for (i in 1..10) {
        if (i % 2 == 1) list.add(i)
    }
    val oddNumbers = list.joinToString(separator = ",")
    println(oddNumbers)

    // with
    val oddNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = " ")
    }
    println(oddNumbers2)
    val oddNumbers3 = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) add(i)
        }
        joinToString(separator = " ")
    }
    println(oddNumbers3)

    // run
    val oddNumbers4 = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = " ")
    }
    println(oddNumbers4)
    val userS = User("sugimoto")
    println(getUserString(userS, "renato"))

    // let
    val oddNumbers5 = mutableListOf<Int>().let { list ->
        for (i in 1..10) {
            if (i % 2 == 1) list.add(i)
        }
        list.joinToString(separator = " ")
    }
    println(oddNumbers5)
    println(createUser("sugimoto"))
    println(createUser(null))

    // apply
    updateUser(20, "Kotlin", "Nagoya")

    // also
    updateUser2(20, "Kotlin", "Nagoya")

    // overload
    println(Num(5) + Num(2))
    println(Num(5) > Num(2))

    // dele
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(CommonCalculationExecutor())
    executorDelegate.printStartMessage()
    println(executorDelegate.calc(8, 11))

    val person = Person()
    person.name = "Takehata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)

    val delegatePerson = DelegatePerson()
    delegatePerson.name = "Sugimoto"
    delegatePerson.address = "Fukuoka"
    println(delegatePerson.name)
    println(delegatePerson.address)

    // collection
    val list2 = listOf(1, 2, 3)
    list2.forEach { num -> println(num) }
    list2.forEach { println(it) }

    val idList = list2.map { it * 10 }
    idList.forEach { println(it) }

    val listUser = listOf(User9(1, "Sugimoto", 20), User9(2, "Sakai", 30))
    val idListUser = listUser.map { it.id }
    idListUser.forEach { println(it) }
    val filterdList = listUser.filter { it.age == 20 }
    filterdList.forEach { println(it) }
    println(listUser.first())
    println(listUser.last())
    println(listUser.first { it.age == 30 })
    println(listUser.firstOrNull { it.age == 20 })
    println(listUser.firstOrNull { it.age == 100 })

    // distinct
    val list3 = listOf(1, 1, 2, 3, 4, 4, 5)
    val distinctList = list3.distinct()
    distinctList.forEach { println(it) }

    // associate
    val list4 = listOf(
        User9(1, "Takehata", 20),
        User9(2, "Kotlin", 20),
        User9(3, "Java", 200)
    )
    val map = list4.associateBy { it.id }
    println(map)
    list4.forEach { println(map[it.id]) }

    val list5 = listOf("Sugimoto", "Takenaka", "Sasaki")
    val map2 = list5.associateWith { it.length }
    println(map2)
    list5.forEach { println(map2[it]) }

    // group
    val mapGroup = list4.groupBy { it.age }
    println(mapGroup)
    println(mapGroup[20])

    // count
    val oddNumberCount = list3.count { it % 2 == 1 }
    println(oddNumberCount)
    val sugimotoCount = list5.count { it == "Sugimoto" }
    println(sugimotoCount)

    // chunked
    val listName = listOf("Takehara", "Kotlin", "Java", "JS")
    val chunkedList = listName.chunked(2)
    println(chunkedList)
    chunkedList.forEach { println(it) }

    // reduce
    val listNumber = listOf(1, 2, 3, 4, 5)
    val resultNumber = listNumber.reduce { sum, value ->
        println("$sum + $value")
        sum + value
    }
    println(resultNumber)
    println(listOf(1, 2, 3, 4, 5).reduce { sum, value -> sum * value })

    // coroutine
    GlobalScope.launch {
        delay(1000L)
        println("Renato.")
    }
    println("My name is")
    Thread.sleep(2000L)

    runBlocking {
        launch {
            delay(1000L)
            println("Sugimoto.")
        }
        println("My name is")
    }

    suspend fun printName() {
        delay(1000L)
        println("Renato.")
    }

    runBlocking {
        launch { printName() }
        println("My name is")
    }

    runBlocking {
        val result = async {
            delay(2000L)
            var sum = 0
            for (i in 1..10) {
                sum += i
            }
            sum
        }
        println("計算中")
        println("sum = ${result.await()}")
    }

    runBlocking {
        val num1 = async {
            delay(2000L)
            1 + 2
        }
        val num2 = async {
            delay(1000L)
            3 + 4
        }
        println("sum = ${num1.await() + num2.await()}")
    }
}

typealias Calc = (Int, Int) -> Int

fun spuare(num: Int): Int = num * num
fun Int.square(): Int = this * this
