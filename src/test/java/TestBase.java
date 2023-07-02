import org.testng.annotations.*;

public class TestBase {

    @BeforeTest
    public static void setup() {
        System.out.println("Before tests");
    }

    @AfterTest
    public static void teardown() {
        System.out.println("After test");
    }

    @BeforeGroups("Positive")
    public static void positiveSetup() {
        System.out.println("Before groups Positive");
    }

    @AfterGroups("Positive")
    public static void positiveTeardown() {
        System.out.println("After groups Positive");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }
}
