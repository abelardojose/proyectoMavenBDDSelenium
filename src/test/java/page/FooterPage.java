package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class FooterPage extends BasePage {

    private final By twitterButton = By.xpath("//a[text()='Twitter']");
    private final By facebookButton = By.xpath("//a[text()='Facebook']");
    private final By linkedinButton = By.xpath("//a[text()='LinkedIn']");

    @Override
    public void waitPageToLoad() {

    }

    @Override
    public void verifyPage() {

    }

    public void verifySocialMediaLinks(String twitterUrl, String linkedinUrl, String facebookUrl) {
        Logs.info("Verificando los links de las redes sociales");

        final var facebookLabel = find(facebookButton);
        final var linkedinLabel = find(linkedinButton);
        final var twitterLabel = find(twitterButton);

        Assertions.assertAll(
                () -> Assertions.assertTrue(facebookLabel.isDisplayed()),
                () -> Assertions.assertTrue(facebookLabel.isEnabled()),
                () -> Assertions.assertEquals(facebookLabel.getAttribute("href"), facebookUrl),

                () -> Assertions.assertTrue(linkedinLabel.isDisplayed()),
                () -> Assertions.assertTrue(linkedinLabel.isEnabled()),
                () -> Assertions.assertEquals(linkedinLabel.getAttribute("href"), linkedinUrl),

                () -> Assertions.assertTrue(twitterLabel.isDisplayed()),
                () -> Assertions.assertTrue(twitterLabel.isEnabled()),
                () -> Assertions.assertEquals(twitterLabel.getAttribute("href"), twitterUrl)
        );
    }
}
