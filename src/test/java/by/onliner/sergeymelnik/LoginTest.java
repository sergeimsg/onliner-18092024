package by.onliner.sergeymelnik;

import by.onliner.sergeymelnik.driver.Singletone;
import by.onliner.sergeymelnik.pageObjects.CookiePage;
import by.onliner.sergeymelnik.pageObjects.HomePage;
import by.onliner.sergeymelnik.pageObjects.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class LoginTest {

    @Test
    public void testWithEmptyButton(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        CookiePage cookiePage = new CookiePage();
        cookiePage.clickButtonCloseCookie();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();

    }

    @AfterEach
    public void closeSite(){
        Singletone.closeDriver();
    }

}
