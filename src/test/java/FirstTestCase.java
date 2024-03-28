import org.testng.annotations.Test;

public class FirstTestCase {

    // setup, open browser
    // login
    // close browser

    @Test(priority = 1)
    void setup() {

        System.out.println("Open browser");
    }

    @Test(priority = 2)
    void login() {

        System.out.println("Log in");
    }

    @Test(priority = 3)
    void teardown() {

        System.out.println("Closing browser");
    }
}
