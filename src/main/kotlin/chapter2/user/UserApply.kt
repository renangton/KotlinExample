package chapter2.user

data class UserApply(val id: Int, var name: String, var address: String)

fun getUser(id: Int): UserApply {
    return UserApply(id, "Tanaka", "Tokyo")
}

fun updateUser(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).apply {
        name = newName
        address = newAddress
    }
    println(user)
}

fun updateUser2(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).also { u ->
        u.name = newName
        u.address = newAddress
    }
    println(user)
}

fun updateUser3(id: Int, newName: String, newAddress: String) {
    val user = getUser(id).also {
        it.name = newName
        it.address = newAddress
    }
    println(user)
}
