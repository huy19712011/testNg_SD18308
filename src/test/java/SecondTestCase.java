import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {

        System.out.println("Open browser");
    }

    @Test(priority = 3)
    void searchCustomer() {

        System.out.println("Searching");
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 2)
    void login() {

        System.out.println("Log in");
    }

    @Test(priority = 4)
    void addCustomer() {
        System.out.println("Adding customer");
    }

    @Test(priority = 5)
    void teardown() {

        System.out.println("Closing browser");
    }

}
