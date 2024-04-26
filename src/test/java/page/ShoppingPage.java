package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class ShoppingPage extends BasePage {
    private final By inventoryList = By.className("inventory_list");
    private final By productTitle = By.xpath("//span[text()='Products']");
    private final By selectItem = By.cssSelector("select[data-test='product-sort-container']");
    private final By selectItemName = By.className("inventory_item_name");

    private By getItemName(String itemName) {
        final var xpath = String.format("//div[text()='%s']", itemName);
        return By.xpath(xpath);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(inventoryList, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificamos la pagina de Shopping");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(inventoryList).isDisplayed()),
                () -> Assertions.assertTrue(find(productTitle).isDisplayed()),
                () -> Assertions.assertTrue(find(selectItem).isDisplayed())
        );
    }

    public void goToItemDetail(String itemName) {
        Logs.info("Navegando al detalle del item %s", itemName);
        find(getItemName(itemName)).click();
    }

}
