// Рішення другого рівня
class SecondLevel {
    fun getCountOfThreeDigitNumbers(numbers: Array<Int>): Int {
        return numbers.filter { num -> isThreeDigitNumber(num) }.size
    }

    private fun isThreeDigitNumber(number: Number): Boolean {
        return number.toString().length == 3
    }
}