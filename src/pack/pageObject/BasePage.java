package pack.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    // Action
    public String GetPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void ClearTextbox(By webElement) {
        try {
            driver.findElement(webElement).clear();
        } catch (Exception ex) {
            throw ex;
        }
    }
    public void sendKey(By webElement,String text, boolean clearOldText){
        if(clearOldText){
            this.ClearTextbox(webElement);
        }
        this.driver.findElement(webElement).sendKeys(text);
    }

    public void ClickButton(By button) {
        driver.findElement(button).click();
    }

}
