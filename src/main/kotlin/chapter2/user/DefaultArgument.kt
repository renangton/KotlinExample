package chapter2.user

class DefaultArgument {
    fun printUserInfo(id: Int, name: String = "Default Name") {
        println("id = $id name = $name")
    }
}
