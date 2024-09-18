package by.onliner.sergeymelnik.pageObjects;

import by.onliner.sergeymelnik.driver.Singletone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private final String URL ="https://www.onliner.by/";

    public HomePage() {
        this.driver = Singletone.getDriver();
    }

    public void openPage(){
        driver.get(URL);
    }

    public void clickButtonLogin(){
        driver.findElement(By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH))
                .click();
    }
}
