package main.java.Zoo.Fish;

public class Dolphin extends BaseFish{
    public Dolphin(String name) {
        super(name);
    }
    @Override
    public String getAnimalType() {
        return "Dolphin";
    }
}
