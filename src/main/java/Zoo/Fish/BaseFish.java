package main.java.Zoo.Fish;

import main.java.Zoo.AbstractAnimal;

public class BaseFish extends AbstractAnimal {
    public BaseFish(String name) {
        super(name);
    }

    @Override
    public String breath() {
        return "Breathing under water";
    }

    @Override
    public String move() {
        return "Swimming in water";
    }

    public String getAnimalType() {
        return "Animal type: fish";
    }


}
