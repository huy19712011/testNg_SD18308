import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static ChromeOptions options;
    public static WebDriver webDriver;

    //@Test
    @BeforeTest
    void setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver(options);

        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }

    @Test
    void testSteps() throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));

        String actualFirstCategory = webElement.getText();
        String expectedFirstCategory = "Formal Shoes";

        Assert.assertEquals(expectedFirstCategory, actualFirstCategory);

        webDriver.close();
    }
}










