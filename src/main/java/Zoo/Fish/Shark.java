package main.java.Zoo.Fish;

public class Shark extends BaseFish {
    public Shark(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Shark";
    }
}
