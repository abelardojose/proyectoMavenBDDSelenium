package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class TopBarPage extends BasePage {

    private final By title = By.xpath("//div[text()='Swag Labs']");
    private final By menuBurger = By.id("react-burger-menu-btn");


    @Override
    public void waitPageToLoad() {
        waitPage(title, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando el top bar");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(title).isDisplayed()),
                () -> Assertions.assertTrue(find(menuBurger).isDisplayed())
        );
    }

    public void openMenuBurger() {
        Logs.info("Abriendo el menu Burger");
        find(menuBurger).click();
    }
}
