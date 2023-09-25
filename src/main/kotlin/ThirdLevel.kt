class ThirdLevel {
    fun rotateFirstAndLastDigits(number: Int): Int {
        val string = StringBuilder(number.toString())

        val firstDigitIndex = 0
        val lastDigitIndex = string.length - 1

        val firstDigit = string[firstDigitIndex]
        val lastDigit = string[lastDigitIndex]

        string.setCharAt(firstDigitIndex, lastDigit)
        string.setCharAt(lastDigitIndex, firstDigit)

        return string.toString().toInt()
    }
}