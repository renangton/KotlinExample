package chapter2.dele

class AddCalculationExecutorDelegate(
    private val calculationExecutor: CalculationExecutor
) : CalculationExecutor by calculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
