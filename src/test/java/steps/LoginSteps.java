package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import utilities.CommonFlows;

public class LoginSteps {

    private final CommonFlows commonFlows = new CommonFlows();
    private final LoginPage loginPage = new LoginPage();

    @Given("El usuario navega a la pagina")
    public void elUsuarioNavegaALaPagina() {
        commonFlows.goToLoginPage();
    }

    @When("El usuario escribe el username {string} con el password {string} y presiona el boton de Login")
    public void elUsuarioEscribeElUsernameConElPasswordYPresionaElBotonDeLogin(String username, String password) {
        loginPage.fillLogin(username, password);
    }

    @Then("Debe aparecer un mensaje de error indicando {string}")
    public void debeAparecerUnMensajeDeErrorIndicando(String textoError) {
        loginPage.verifyErrorMessage(textoError);

    }

    @Then("El usuario verifica la UI de la pagina de Login sea correcta")
    public void elUsuarioVerificaLaUIDeLaPaginaDeLoginSeaCorrecta() {
        loginPage.verifyPage();
    }
}
