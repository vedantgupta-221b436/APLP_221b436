class Voice {
    Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Tiger();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    void templateMethod() {
        prepareVoice();
        hear();
    }
}
