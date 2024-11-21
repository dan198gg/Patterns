package delegate

class CatAibolit(val name: String): CatVet {
    override fun treat(c: Cat) {
        println("Я доктор $name лечу кота")
        c.meow()
    }
}