import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = Driver.getDriver();
        driver.get("https://shopwildberries.com/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
