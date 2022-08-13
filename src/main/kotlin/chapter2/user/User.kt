package chapter2.user

data class User(var name: String)

fun getUserString(user: User?, newName: String): String? {
    return user?.run {
        name = newName
        toString()
    }
}

fun createUser(name: String?): User? {
    return name?.let { User(it) }
}
