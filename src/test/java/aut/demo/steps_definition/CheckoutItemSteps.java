package aut.demo.steps_definition;

import aut.demo.pages.base.page_object.CheckoutPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class CheckoutItemSteps {

    CheckoutPages checkoutPages = new CheckoutPages();

    @And("user click shopping cart")
    public void clickButtonLogin() {
        checkoutPages.clickShoppingCart ();
    }

    @And("user click checkout button")
    public void clickButtonCheckout() {
        checkoutPages.clickCheckOutButton();
    }

    @Given("user input {string} and {string} and {string}")
    public void inputUsernameAndPassword(String firstname, String lastname, String postalcode) {
        checkoutPages.inputFirstName(firstname);
        checkoutPages.inputLastname(lastname);
        checkoutPages.inputPostalCode(postalcode);
    }

    @And("user click continue button")
    public void clickContinueButton() {
        checkoutPages.clickContinue();
    }

    @Then("user can see checkout overview")
    public void isCheckoutOverview() {
        Assert.assertTrue(checkoutPages.isCheckoutOverview());
    }

    @And("user click finish button")
    public void clickFinishButton() {
        checkoutPages.clickFinish();
    }

    @Then("user can see success checkout")
    public void isSuccessCheckot() {
        Assert.assertTrue(checkoutPages.isSuccessCheckout());
    }

}
