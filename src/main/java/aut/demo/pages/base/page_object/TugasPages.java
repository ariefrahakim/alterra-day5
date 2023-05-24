package aut.demo.pages.base.page_object;

import aut.demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class TugasPages extends BasePageObject {

    public void scrollToBottomPage(){
        scrollDown();
    }

    public void clickButtonFacebook() {
        By element = By.xpath("//a[contains(text(),'Facebook')]");
        clickOn(element);
    }

    public void moveToTab() {
        moveToTab(1);
    }

    public String getTitleFacebook() {
        return getTitle();
    }

}
