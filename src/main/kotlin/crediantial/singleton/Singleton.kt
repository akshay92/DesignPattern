package crediantial.singleton

class Singleton private constructor() {

    companion object {

        @Volatile
        private var instance: Singleton? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: Singleton().also { instance = it }
        }
    }

}