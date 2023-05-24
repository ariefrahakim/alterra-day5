package aut.demo.steps_definition;

import aut.demo.pages.base.page_object.TugasPages;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class TugasStep {

    TugasPages tugasPages = new TugasPages();

    @And("user scroll to bottom page")
    public void userScrollPage(){
        tugasPages.scrollToBottomPage();
    }

    @And("user click facebook")
    public void userClickFacebook() {
        tugasPages.clickButtonFacebook();

    }

    @And("user move to tab")
    public void userMoveToTab(){
        tugasPages.moveToTab();
    }

    @Then("user can validate url title")
    public void isTitleFacebook()  {
        System.out.println("Title = " + tugasPages.getTitleFacebook());
        Assert.assertEquals(tugasPages.getTitleFacebook(), "Sauce Labs | Facebook");
    }
}
