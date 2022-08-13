package chapter2.overload

data class Num(val value: Int) {
    operator fun plus(num: Num): Num {
        return Num(value + num.value)
    }

    operator fun compareTo(num: Num): Int {
        return value.compareTo(num.value)
    }
}
