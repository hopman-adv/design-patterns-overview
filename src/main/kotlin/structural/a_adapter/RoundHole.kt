package structural.a_adapter

class RoundHole(val radius: Double) {
    fun fits(roundPeg: RoundPeg): Boolean {
        return if(roundPeg.radius == null) {
            false
        } else {
            return radius >= roundPeg.radius
        }
    }
}


