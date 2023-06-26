package ninay.zoo.Birds;

public class Parrot extends BaseBird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Parrot";
    }
}
