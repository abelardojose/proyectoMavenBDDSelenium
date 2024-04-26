package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ItemDetailPage;
import page.ShoppingPage;
import utilities.CommonFlows;

public class ItemDetailSteps {

    private final CommonFlows commonFlows = new CommonFlows();
    private final ItemDetailPage itemDetailPage = new ItemDetailPage();
    private final ShoppingPage shoppingPage = new ShoppingPage();

    @Given("El usuario va al detalle del item llamado {string}")
    public void elUsuarioVaAlDetalleDelItemLlamado(String nameItem) {
        commonFlows.goToItemDetail(nameItem);

    }

    @Then("El usuario verifica que la UI de la pagina del detalle del item sea coorecto")
    public void elUsuarioVerificaQueLaUIDeLaPaginaDelDetalleDelItemSeaCoorecto() {
        itemDetailPage.verifyPage();
    }

    @When("El usuario da click en Back to products")
    public void elUsuarioDaClickEnBackToProducts() {
        itemDetailPage.clickingBackToProducts();
    }

    @Then("La aplicacion redirige a la pagina de Shopping")
    public void laAplicacionRedirigeALaPaginaDeShopping() {
        shoppingPage.waitPageToLoad();
        shoppingPage.verifyPage();
    }
}
