package suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import services.Locator;
import services.Time;

public class Authorization {

    private WebDriver driver;

    public static void main(String[] args) {

    }

    @Parameters({"appURL"})
    @BeforeClass
    public void setUp(String appURL) {
        driver = new FirefoxDriver();
    }


    @Parameters({"appURL"})
    @Test(priority = 1)
    public void TurnOnBrowser(String appURL) throws Exception {

        driver.get(appURL);

        Time.waitForLoad(driver);
    }


    @Test(priority = 2)
    public void Login() throws Exception {
//        driver.findElement(By.id("element id"))
        Assert.assertFalse(Locator.findById(driver, "btnLogin").isEnabled());
        Locator.findById(driver, "email").sendKeys("vu@test.com");
        Locator.findById(driver, "password").sendKeys("Abc123123");
        Assert.assertTrue(Locator.findById(driver, "btnLogin").isEnabled());
        Locator.findById(driver, "btnLogin").click();

        Time.waitUntilDataLoaded(driver);
        Thread.sleep(5000);
    }

    @AfterClass
    public void Destroy(){
        driver.close();
    }
}
