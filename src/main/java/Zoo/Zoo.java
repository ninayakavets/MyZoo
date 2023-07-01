package main.java.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    protected List<AbstractAnimal> zooAnimals;

    public Zoo() {
        this.zooAnimals = new ArrayList<>();
    }

    public void addAnimal(AbstractAnimal animal) {
        zooAnimals.add(animal);
    }


    public void printAnimalInfo(int animalIndex) {

        AbstractAnimal animal = zooAnimals.get(animalIndex - 1);
        System.out.println("It's a " + animal.getAnimalType() + " , " + animal.getName());
        System.out.println("breath: " + animal.breath());
        System.out.println("move: " + animal.move());
    }

    public int getZooSize() {
        return zooAnimals.size();
    }

    public void printZooInfo() {
        System.out.println("We have " + getZooSize() + " animals");
        for (int i = 0; i < getZooSize(); i++) {
            System.out.print((i + 1) + " ");
            System.out.println(zooAnimals.get(i));
        }
    }
}