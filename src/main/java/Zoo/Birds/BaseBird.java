package main.java.Zoo.Birds;

import main.java.Zoo.AbstractAnimal;

public class BaseBird extends AbstractAnimal {
    public BaseBird(String name) {
        super(name);
    }

    @Override
    public String breath() {
        return "Breathing air";
    }

    @Override
    public String move() {
        return "Flies in the sky";
    }

    public String getAnimalType() {
        return "Animal type: Bird";
    }
}
