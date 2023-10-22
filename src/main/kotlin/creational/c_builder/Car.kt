package creational.c_builder

class Car(
    val carType: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer?,
    val gpsNavigator: GPSNavigator,
    val fuel: Int = 0
) {
    init {
        if(tripComputer != null) tripComputer.car = this
    }
}

class Manual(
    val carType: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer? = null,
    val gpsNavigator: GPSNavigator? = null,
) {
    fun print() = """Type of car: $carType.
            Count of seats: $seats.
            Engine: volume - ${engine.volume}. 
            Mileage - ${engine.milege}
            Transmission: $transmission
            ${if (tripComputer != null) "Trip Computer: Functional" else "Trip Computer: N/A"}
            ${if (gpsNavigator != null) "GPS Navigator: Functional" else "GPS Navigator: N/A"}
        """
}