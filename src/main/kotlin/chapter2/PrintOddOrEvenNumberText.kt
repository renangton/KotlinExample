package chapter2

class PrintOddOrEvenNumberText {
    fun printOddOrEvenNumberText(num: Int) {
        var text = ""
        if (num % 2 == 1) {
            text = "奇数"
        } else {
            text = "偶数"
        }
        println(text)
    }

    fun printOddOrEvenNumberText2(num: Int) {
        val text = if (num % 2 == 1) {
            "奇数"
        } else {
            "偶数"
        }
        println(text)
    }

    fun printOddOrEvenNumberText3(num: Int) {
        val text = if (num % 2 == 1) "奇数" else "偶数"
        println(text)
    }

    fun getOddOrEvenNumberText(num: Int): String {
        return if (num % 2 == 1) "奇数" else "偶数"
    }

    fun printNumText(num: Int) {
        val text = when (num) {
            100 -> "100!"
            200 -> "200!"
            else -> "Fooo!"
        }
        println(text)
    }
}
