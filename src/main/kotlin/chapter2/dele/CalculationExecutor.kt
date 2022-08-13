package chapter2.dele

interface CalculationExecutor {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessage()
}

class CommonCalculationExecutor(override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not implementscalc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}
