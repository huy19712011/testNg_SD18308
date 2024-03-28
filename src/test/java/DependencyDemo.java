import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {

    // - start car
    // - drive car
    // - stop car
    // - park car
    @Test
    void startCar() {
        System.out.println("Car start");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void partCar() {
        System.out.println("Car parked");
    }

}
