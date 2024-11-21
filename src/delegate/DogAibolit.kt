package delegate

class DogAibolit(val name: String): DogVet {
    override fun treat(d: Dog) {
        println("Я доктор $name лечу собаку")
        d.gav()
    }
}