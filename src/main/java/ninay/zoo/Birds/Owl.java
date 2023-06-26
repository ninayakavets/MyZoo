package ninay.zoo.Birds;

public class Owl extends BaseBird {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Owl";
    }
}
