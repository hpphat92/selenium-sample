package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTestCase {

    public static void main(String[] args){

    }

    @Test(priority = 1)
    public void Test1() throws Exception {
        // TODO Auto-generated method stub

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");


        Thread.sleep(15);

        // Close the driver
        driver.quit();
    }
}
