package pack.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private BasePage basePage;
    private WebDriver driver;
    private By btnLogin = By.id("btnLogin");
    private By email = By.id("email");
    private By password = By.id("password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.basePage = new BasePage(driver);
    }
    public boolean getButtonLoginStatus(){
        return this.driver.findElement(btnLogin).isEnabled();
    }
    public void tryLogin(String email, String password){
        this.basePage.sendKey(this.email, email, true);
        this.basePage.sendKey(this.password, password, true);
        this.basePage.ClickButton(this.btnLogin);
    }
}
