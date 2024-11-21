package delegate

class VetClinika(val catDoctor: CatAibolit,
                 val dogDoctor: DogAibolit): DogVet, CatVet {
    override fun treat(d: Dog) {
        dogDoctor.treat(d)
    }

    override fun treat(c: Cat) {
        catDoctor.treat(c)
    }
}