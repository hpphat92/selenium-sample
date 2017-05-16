package pack.suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pack.pageObject.LoginPage;
import pack.services.Time;
public class Authorization {

    private WebDriver driver;
    private LoginPage loginPage;

    public static void main(String[] args) {

    }

    @Parameters({"appURL"})
    @BeforeClass
    public void setUp(String appURL) {
        driver = new FirefoxDriver();
        this.loginPage = new LoginPage(driver);

    }


    @Parameters({"appURL"})
    @Test(priority = 1)
    public void TurnOnBrowser(String appURL) throws Exception {

        driver.get(appURL);

        Time.waitForLoad(driver);
    }


    @Test(priority = 2)
    public void LoginWithFailedCredential() throws Exception {
//
        this.loginPage.tryLogin("ABC","XYZ");

        Time.waitForLoad(driver);


        this.loginPage.tryLogin("vu@test.com","Abc123123");

        Time.waitForLoad(driver);



    }
    @Test(priority = 3)
    public void LoginWithPassedCredential() throws Exception {
        this.loginPage.tryLogin("vu@test.com","Abc123123");

        Time.waitForLoad(driver);

    }

    @AfterClass
    public void Destroy(){
        driver.close();
    }
}
