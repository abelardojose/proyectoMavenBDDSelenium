package steps;

import io.cucumber.java.en.Then;
import page.FooterPage;

public class FoooterSteps {

    private final FooterPage footerPage = new FooterPage();

    @Then("El usuario verifica que los links sean coorecto: {string} , {string}, {string}")
    public void elUsuarioVerificaQueLosLinksSeanCoorecto(String tiwitterUrl, String facebookUrl, String linkedInUrl) {
        footerPage.verifySocialMediaLinks(tiwitterUrl, linkedInUrl, facebookUrl);
    }
}
