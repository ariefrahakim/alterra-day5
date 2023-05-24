package aut.demo.steps_definition;

import aut.demo.pages.base.page_object.AddToCartPages;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class AddToCartStep {

    AddToCartPages addToCartPages = new AddToCartPages();

    @And("user click add to cart")
    public void userClickAddToCart() { addToCartPages.clickAddToCart();
    }


    @Then("user can see the shopping cart added")
    public void isSuccessAddToCart()
    {
        Assert.assertTrue(addToCartPages.isSuccessAddToCart());
    }
}
