package main.java.Zoo.Birds;

public class Parrot extends BaseBird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Parrot";
    }
}
