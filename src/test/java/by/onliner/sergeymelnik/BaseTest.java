package by.onliner.sergeymelnik;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public void startPage(){
        driver = new ChromeDriver();

    }
}
