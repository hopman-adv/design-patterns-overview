package creational.d_singleton
//Different Singletons: https://www.baeldung.com/kotlin/singleton-classes#conclusion
class Singleton private constructor() {
    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: Singleton().also { instance = it }
            }
    }
}