package org.example.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

//    @FindBy(css = "header a[title='Carina']")
//    private ExtendedWebElement logo;
//    private ExtendedWebElement header;

    public HomePage(WebDriver driver) {
        super(driver);
//        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }




}
