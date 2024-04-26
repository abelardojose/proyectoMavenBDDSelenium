package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;
import utilities.Logs;

import java.time.Duration;

public class MenuBurger extends BasePage {

    private final By btnLogout = By.id("logout_sidebar_link");
    private final By btnAbout = By.xpath("//a[text()='About']");


    @Override
    public void waitPageToLoad() {
        waitPage(btnLogout, this.getClass().getSimpleName());

        Logs.info("Esperando que sea clickeable ya que tiene una transicion");
        final var wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogout));
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando el menu burger");
        Assertions.assertTrue(find(btnLogout).isDisplayed());
    }

    public void clickingLogout() {
        Logs.info("Clickenado Logout");
        find(btnLogout).click();
    }

    public void clickingAbout() {
        Logs.info("Clickenado Logout");
        find(btnAbout).click();
    }

    public void verifyAboutOption(String aboutUrl) {
        final var aboutLink = find(btnAbout);

        Assertions.assertAll(
                () -> Assertions.assertTrue(aboutLink.isDisplayed()),
                () -> Assertions.assertTrue(aboutLink.isEnabled()),
                () -> Assertions.assertEquals(aboutLink.getAttribute("href"), aboutUrl)
        );
    }
}
