package ninay.zoo.Mammals;
import ninay.zoo.AbstractAnimal;

abstract public class BaseMammal extends AbstractAnimal {

    public BaseMammal(String name) {
        super(name);
    }

    @Override
    public String breath() {
        return "Breathing air";
    }

    @Override
    public String move() {
        return "Runs on the ground";
    }

    public String getAnimalType() {
        return "Animal type: mammal";
    }


}

