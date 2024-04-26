package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class LoginPage extends BasePage {

    private final By userNameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.xpath("//h3[@data-test='error']");
    private final By titlePage = By.className("app_logo");

    @Override
    public void waitPageToLoad() {
        waitPage(userNameInput, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(userNameInput).isDisplayed()),
                () -> Assertions.assertTrue(find(passwordInput).isDisplayed()),
                () -> Assertions.assertTrue(find(loginButton).isDisplayed())
        );
    }

    public void fillLogin(String userName, String password) {
        Logs.info("Escribiendo el username");
        find(userNameInput).sendKeys(userName);
        Logs.info("Escribiendo el password");
        find(passwordInput).sendKeys(password);
        Logs.info("Click en el boton Login");
        find(loginButton).click();
    }

    public void verifyErrorMessage(String errorText) {
        Logs.info("Verificando que el error sea visible y tenga el texto correcto");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(errorMessage).isDisplayed()),
                () -> Assertions.assertEquals(find(errorMessage).getText(), errorText)
        );
    }

    public void entryPage() {
        Logs.info("Valido ingreso a la pagina principal");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titlePage).isDisplayed()),
                () -> Assertions.assertEquals(find(titlePage).getText(), "Swag Labs")
        );
    }
}
