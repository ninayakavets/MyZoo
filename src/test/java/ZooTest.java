import ninay.zoo.Birds.Owl;
import ninay.zoo.Fish.Dolphin;
import ninay.zoo.Mammals.Bear;
import ninay.zoo.Mammals.Leon;
import ninay.zoo.Zoo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZooTest extends TestBase {

    @Test(groups = "Positive")
    public static void correctAddingOfAnimal() {

        Leon leo = new Leon("TestLeon");

        var myZoo = new Zoo();

        Assert.assertEquals(myZoo.getZooSize(), 0);
        myZoo.addAnimal(leo);
        Assert.assertEquals(myZoo.getZooSize(), 1);
    }

    @Test(groups = "Positive")
    public static void correctAnimalType() {
        Bear bear = new Bear("TestBear");
        Assert.assertEquals(bear.getAnimalType(), "Bear");

    }

    @Test(groups = "Negative")
    public static void incorrectAnimalType() {
        Leon leo = new Leon("TestLeon");
        Assert.assertNotEquals(leo.getAnimalType(), "Monkey");
    }

    @Test(groups = "Positive")
    public static void correctBreathType(){
        Owl owl = new Owl("TestOwl");
        Assert.assertEquals(owl.breath(),"Breathing air");
    }
    @Test(groups = "Negative")
    public static void incorrectMoveType(){
        Dolphin dolphin = new Dolphin("TestDolphin");
        Assert.assertNotEquals(dolphin.move(), "Runs on the ground");
    }
}
