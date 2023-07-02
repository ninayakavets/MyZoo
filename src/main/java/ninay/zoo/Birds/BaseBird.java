package ninay.zoo.Birds;

import ninay.zoo.AbstractAnimal;

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
