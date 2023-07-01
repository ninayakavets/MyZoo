package main.java.Zoo.Mammals;

public class Monkey extends BaseMammal{
    public Monkey(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Monkey";
    }
}
