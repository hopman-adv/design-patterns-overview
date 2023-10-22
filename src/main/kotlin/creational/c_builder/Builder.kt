package creational.c_builder


interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer)
    fun setGPSNavigator(gpsNavigator: GPSNavigator)
}