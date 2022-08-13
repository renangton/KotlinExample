package chapter2.user

data class User7(val id: Int, var name: String) {
    val isValidName: Boolean
        get() = name != ""
}
