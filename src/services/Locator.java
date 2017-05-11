package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {
    public static WebElement findById(WebDriver driver, String idSelector) {
     return driver.findElement(By.id(idSelector));
    }
}
