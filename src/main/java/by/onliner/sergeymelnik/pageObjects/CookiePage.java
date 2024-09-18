package by.onliner.sergeymelnik.pageObjects;

import by.onliner.sergeymelnik.driver.Singletone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookiePage {
    WebDriver driver;

    public CookiePage() {
        this.driver = Singletone.getDriver();
    }

    public void clickButtonCloseCookie(){
        Waiters.waitFor(2);
        By buttonCloseCookieXPath =By.xpath(CookiePageXPath.BUTTON_CLOSE_COOKIE);
        WebElement buttonCloseCookieWebElement = driver.findElement(buttonCloseCookieXPath);
        buttonCloseCookieWebElement.click();
    }
}
