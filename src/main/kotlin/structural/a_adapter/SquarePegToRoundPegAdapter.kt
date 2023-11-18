package structural.a_adapter

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegToRoundPegAdapter(val squarePeg: SquarePeg): RoundPeg(null) {
    @Override
    fun getRadius(): Double {
        val powerOfWidth = squarePeg.width.pow(2.0)
        return  sqrt(powerOfWidth * 2)
    }
}