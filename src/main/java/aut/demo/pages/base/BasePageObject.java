package aut.demo.pages.base;

import aut.demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static aut.demo.utils.Constants.timeout;
import static java.lang.Thread.sleep;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public WebElement waitUntil(ExpectedCondition<WebElement> conditions, Integer timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        return (WebElement) wait.until(conditions);
    }

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOn(By element) {
        waitUntil(ExpectedConditions.elementToBeClickable(element), timeout);
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(element), timeout);
        getDriver().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public void scrollDown() {
        wait(1000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, 350)");
    }

    public void moveToTab(int index) {
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
        System.out.println(tabs);
    }

    public String getTitle() {
        wait(3000);
        return getDriver().getTitle();
    }

}
