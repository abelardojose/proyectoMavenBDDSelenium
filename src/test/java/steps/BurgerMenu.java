package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.MenuBurger;
import utilities.CommonFlows;

public class BurgerMenu {
    private final CommonFlows commonFlows = new CommonFlows();
    private final LoginPage loginPage = new LoginPage();
    private final MenuBurger menuBurger = new MenuBurger();

    @Given("El usuario entre a logueado y abre el burger menu")
    public void elUsuarioEntreALogueadoYAbreElBurgerMenu() {
        commonFlows.openBurgueMenu();
    }

    @When("El usuario hace clic en la opcion logout")
    public void elUsuarioHaceClicEnLaOpcionLogout() {
        menuBurger.clickingLogout();
    }

    @Then("La aplicacion redirige a la pagina de login")
    public void laAplicacionRedirigeALaPaginaDeLogin() {
        loginPage.waitPageToLoad();
        loginPage.verifyPage();
    }

    @Then("El usuario verifica la opcion de About tenga el link correcto de {string}")
    public void elUsuarioVerificaLaOpcionDeAboutTengaElLinkCorrectoDe(String url) {
        menuBurger.verifyAboutOption(url);
    }
}
