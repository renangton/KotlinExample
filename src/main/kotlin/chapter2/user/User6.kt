package chapter2.user

class User6 {
    val id: Int = 1
    val name = "Kotlin"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User6

        if (id != other.id) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        return 31 * name.hashCode() + id
    }

    override fun toString(): String {
        return "User6(id = $id, name = $name)"
    }
}
