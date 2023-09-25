import kotlin.math.cos
import kotlin.math.sin

// Рішення першого рівня

class FirstLevel {
    fun getAngleInfo(angleInDegrees: Double): String {
        val trigonometricInfo = getTrigonometricFunctionsInfo(angleInDegrees)
        val angleInRadians = getAngleInRadians(angleInDegrees)

        return "$trigonometricInfo. Value in radians: $angleInRadians."
    }

    private fun getTrigonometricFunctionsInfo(angleInDegrees: Double): String {
        val angleSin = sin(angleInDegrees)
        val angleCos = cos(angleInDegrees)

        return if (angleSin > angleCos) {
            "Angle sin is greater"
        } else {
            "Angle cos is greater"
        }
    }

    private fun getAngleInRadians(angleInDegrees: Double): Double {
        return angleInDegrees * (Math.PI / 180)
    }
}