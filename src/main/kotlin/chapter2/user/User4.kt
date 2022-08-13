package chapter2.user

class User4 {
    lateinit var name: String
    val isValidname: Boolean
        get() = name != ""
}
