package ninay.zoo;

abstract public class AbstractAnimal {

    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return ("name: " + name);
    }

    public abstract String getAnimalType();

    public abstract String breath();

    public abstract String move();

    @Override
    public String toString() {
        return getAnimalType() + " " + getName();
    }

}
