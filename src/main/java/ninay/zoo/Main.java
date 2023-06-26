package ninay.zoo;

import ninay.zoo.Birds.Owl;
import ninay.zoo.Birds.Parrot;
import ninay.zoo.Fish.Dolphin;
import ninay.zoo.Fish.Shark;
import ninay.zoo.Mammals.Bear;
import ninay.zoo.Mammals.Leon;
import ninay.zoo.Mammals.Monkey;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo();

        Leon leo = new Leon("Leo");
        Bear teddy = new Bear("Teddy");
        Monkey abby = new Monkey("Abby");
        Shark sharky = new Shark("Sharky");
        Dolphin rainbow = new Dolphin("Rainbow");
        Parrot gosha = new Parrot("Gosha");
        Owl sowa = new Owl("Sowa");

        myZoo.addAnimal(leo);
        myZoo.addAnimal(teddy);
        myZoo.addAnimal(abby);
        myZoo.addAnimal(sharky);
        myZoo.addAnimal(rainbow);
        myZoo.addAnimal(gosha);
        myZoo.addAnimal(sowa);

        int index;
        System.out.println("Welcome to the Zoo!");
        myZoo.printZooInfo();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose animal number you want to see or 0 - to exit: ");
            index = scanner.nextInt();
            if ((index > 0) && (index <= myZoo.getZooSize())) {
                myZoo.printAnimalInfo(index);
            } else if (index == 0) {
                System.out.println("exit from zoo");
            } else {
                System.out.println("incorrect Animal number, please enter correct one");
            }


        } while (index > 0);

    }

}