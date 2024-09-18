package by.onliner.sergeymelnik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
        WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin(){
        driver.findElement(By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH))
                .click();
    }
}
