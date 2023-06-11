package main.java.Zoo.Mammals;

public class Bear extends BaseMammal{

    public Bear(String name) {
        super(name);
    }


    @Override
    public String getAnimalType() {
        return "Bear";
    }
}
