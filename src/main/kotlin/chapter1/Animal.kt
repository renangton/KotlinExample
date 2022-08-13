package chapter1

open class Animal(val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("")
}
