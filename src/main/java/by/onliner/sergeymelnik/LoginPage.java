package by.onliner.sergeymelnik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public void clickButtonEnter() {
        By enterXPath = By.xpath(PageObjectXPath.BUTTON_ENTER_LOGIN);
        WebElement webElementEnter = driver.findElement(enterXPath);
        webElementEnter.click();
    }

    public void inputEmail(String login) {
        By loginXpath = By.xpath(PageObjectXPath.INPUTE_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(loginXpath);
        inputEmail.sendKeys(login);
    }

    public void inputPassword(String password) {
        By passwordXpath = By.xpath(PageObjectXPath.INPUTE_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(passwordXpath);
        inputPassword.sendKeys(password);
    }

}
