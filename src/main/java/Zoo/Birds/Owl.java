package main.java.Zoo.Birds;

public class Owl extends BaseBird {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Owl";
    }
}
