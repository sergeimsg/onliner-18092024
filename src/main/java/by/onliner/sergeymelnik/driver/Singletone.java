package by.onliner.sergeymelnik.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singletone {
    private static WebDriver driver;

    public Singletone() {
    }

    public static WebDriver getDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return  driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
