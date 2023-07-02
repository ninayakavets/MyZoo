package ninay.zoo.Mammals;

public class Monkey extends BaseMammal{
    public Monkey(String name) {
        super(name);
    }

    @Override
    public String getAnimalType() {
        return "Monkey";
    }
}
