package delegate

class VetClinika(val catDoctor: CatAibolit,
                 val dogDoctor: DogAibolit):
    DogVet by dogDoctor,
    CatVet by catDoctor