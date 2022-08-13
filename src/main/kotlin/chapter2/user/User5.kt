package chapter2.user

class User5 {
    var name: String = ""
        set(value) {
            if (value == "") field = "Kotlin" else field = value
        }
}
