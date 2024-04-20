import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        try {loginPage.closeAdvIfVisible();}
        catch (Exception e){
            System.out.println("Adv is absent");
        }
        loginPage.clickSignIn();
        //loginPage.setEmail(Users.getUser().getName());
        loginPage.setPassword(Users.getUser().getPassword());
        loginPage.clickSignInForEnter();
        Assertions.assertEquals("Email Address is required.", loginPage.getErrorTextEmptyEmail());
    }
}
