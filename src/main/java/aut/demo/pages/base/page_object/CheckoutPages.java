package aut.demo.pages.base.page_object;

import aut.demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class CheckoutPages extends BasePageObject {

    public void clickShoppingCart() {
        By element = By.id("shopping_cart_container");
        clickOn(element);
    }

    public void clickCheckOutButton() {
        By element = By.id("checkout");
        clickOn(element);
    }

    public void inputFirstName(String firstname) {
        By element = By.id("first-name");
        typeOn(element, firstname);
    }

    public void inputLastname(String lastname) {
        By element = By.id("last-name");
        typeOn(element, lastname);
    }

    public void inputPostalCode(String postalcode) {
        By element = By.id("postal-code");
        typeOn(element, postalcode);
    }


    public void clickContinue() {
        By element = By.id("continue");
        clickOn(element);
    }

    public boolean isCheckoutOverview() {
        By element = By.xpath("//span[contains(text(),'Checkout: Overview')]");
        return isPresent(element);
    }

    public void clickFinish() {
        By element = By.id("finish");
        clickOn(element);
    }

    public boolean isSuccessCheckout() {
        By element = By.id("checkout_complete_container");
        return isPresent(element);
    }
}
