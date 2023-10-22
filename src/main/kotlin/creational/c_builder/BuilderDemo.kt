package creational.c_builder

import creational.a_factoryMethod.FactoryMethodDemo

/* Builder vzor je v Kotlinu možná trochu nadbytečný,
viz https://www.baeldung.com/kotlin/builder-pattern.
* Současně zde popsaný vzor je trochu složitější, než
* se obyčejně uvádí. zde je přítomný i director, který
* dostává různé Buildery, ze kterých pak staví produkty.
*/


fun runBuilderDemo() {
    println("-----------------------------------------------------------------------")
    println("Running Builder Demo...")
    BuilderDemo(Director()).run()
    println("Ending Builder Demo...")
    println("-----------------------------------------------------------------------")
}

class BuilderDemo(private val director: Director) {
    fun run() {
        val builder = CarBuilder()
        director.constructSportsCar(builder)
        val car: Car = builder.getResult()
        println(
            """
                Car built:
                ${car.carType}
                """.trimIndent()
        )
        val manualBuilder = CarManualBuilder()

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder)
        val carManual: Manual = manualBuilder . getResult ()
        println("\nCar manual built:\n" + carManual.print())
    }


}
