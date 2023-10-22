package creational.c_builder

enum class CarType { RACING, FAMILY, SUV }
enum class Transmission { SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC }

data class Engine(val volume: Double, var milege: Double) {
    var started: Boolean = false
    fun on() { started = true }
    fun off() { started = false }
    fun isStarted() = started
    fun go(mileage: Double) { if (started) milege += mileage  else println("Cannot go, start engine!")
    }
}


class TripComputer {
    lateinit var car: Car
    fun showFuelLevel() {
        println("Fuel level: " + car.fuel)
    }

    fun showStatus() {
        if (car.engine.started) {
            println("Car is started")
        } else {
            println("Car isn't started")
        }
    }
}

class GPSNavigator(val route: String = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London")
