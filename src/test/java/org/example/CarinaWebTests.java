package org.example;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CarinaWebTests implements IAbstractTest{

    @Test
    public void test(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://zebrunner.github.io/carina/");
    }
}
