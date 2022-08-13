import chapter1.GreeterImpl
import chapter1.Human
import java.time.LocalDate

fun main() {
    println("Hello Kotlin.")
    printText("Hello!!")
    println(countLength("Kotlin"))
    ifExample(100)
    whenExample(100)
    whenExample2(300)
    whileExample()
    forExample()
    forExampleStep()
    forCollection()
    val sugimoto = Human("sugimoto")
    sugimoto.showName()
    val hello = GreeterImpl()
    hello.hello()
    val and = AndroidPlatform()
    and.showName()
    val ios = IosPlatform()
    ios.showName()
    intListPrint()
    strListPrint()
    mixListPrint()
    mutableListPrint()
    mapPrint()
    mutableMapPrint()
    setPrint()
    mutableSetPrint()
}

fun printText(str: String) {
    println(str)
}

fun countLength(str2: String): Int {
    return str2.length
}

fun ifExample(num: Int) {
    if (num == 100) println("Equal to 100") else if (num < 100) println("Less than 100") else println("Greater than 100")
}

fun whenExample(num: Int) {
    println(
        when (num) {
            100 -> "Equal to 100"
            200 -> "Equal to 200"
            else -> "Undefined value"
        }
    )
}

fun whenExample2(num2: Int) {
    when {
        num2 < 100 -> println("Less than 100")
        num2 == 100 -> println("Equal to 100")
        else -> println("Greater than 100")
    }
}

fun whileExample() {
    var i = 1
    while (i < 10) {
        println("i is $i")
        i++
    }
}

fun forExample() {
    for (i in 1..10) println("i is $i")
}

fun forExampleStep() {
    for (i in 1..20 step 3) println("i is $i")
}

fun forCollection() {
    val list = listOf(1, 2, 5, 6, 10)
    for (i in list) println("i is $i")
}

fun intListPrint() {
    val intList: List<Int> = listOf<Int>(1, 2, 3)
    println(intList)
    println(intList[0])
}

fun strListPrint() {
    val strList: List<String> = listOf<String>("one", "two", "three")
    println(strList)
    println(strList[0])
}

fun mixListPrint() {
    val mixList = listOf("one", "two", "three", 1, LocalDate.of(2022, 2, 14))
    println(mixList)
    println(mixList[0])
    println(mixList::class)
}

fun mutableListPrint() {
    val mutableList = mutableListOf("one", "two", "three")
    println(mutableList)
    mutableList.add("wfewf")
    println(mutableList)
}

fun mapPrint() {
    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[2])
    println(map.containsKey(4))
}

fun mutableMapPrint() {
    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println(mutableMap)
    mutableMap[4] = "four"
    println(mutableMap)
}

fun setPrint() {
    val set = setOf("one", "two", "three")
    println(set.contains("three"))
}

fun mutableSetPrint() {
    val mutableSet = mutableSetOf("one", "two", "three")
    mutableSet.add("four")
    println(mutableSet)
}
