import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = Driver.getDriver();
    }
    public void closeAdvIfVisible() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(LoginLocator.CLOSE_ADV_BTN)).click();
    }
    public void clickSignIn (){
        driver.findElement(By.xpath(LoginLocator.SIGN_IN)).click();
    }
    public void setEmail(String email){
        driver.findElement(By.xpath(LoginLocator.EMAIL)).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(By.xpath(LoginLocator.PASSWORD)).sendKeys(password);
    }
    public void clickSignInForEnter(){
        driver.findElement(By.xpath(LoginLocator.BTN_SIGN_IN_AFTER_EMAIL_AND_PASSWORD)).click();
    }
    public String getErrorTextEmptyPassword(){
        return driver.findElement(By.xpath(LoginLocator.ERROR_EMPTY_PASSWORD)).getText();
    }
    public String getErrorTextEmptyEmail(){
        return  driver.findElement(By.xpath(LoginLocator.ERROR_EMPTY_EMAIL)).getText();
    }
}
