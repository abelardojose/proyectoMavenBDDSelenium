package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.ShoppingPage;
import utilities.CommonFlows;

public class ShoppingSteps {

    private final CommonFlows commonFlows = new CommonFlows();
    private final ShoppingPage shoppingPage = new ShoppingPage();

    @Given("El usuario entra logueado a la pagina de shopping")
    public void elUsuarioEntraLogueadoALaPaginaDeShopping() {
        commonFlows.goToShoppingPage();

    }

    @Then("El usuario verifica la UI de la pagina de Shopping sea correcta")
    public void elUsuarioVerificaLaUIDeLaPaginaDeShoppingSeaCorrecta() {
        shoppingPage.verifyPage();
    }
}
