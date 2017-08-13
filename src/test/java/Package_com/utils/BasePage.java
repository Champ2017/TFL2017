package Package_com.utils;

import Package_com.OpenDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Package_com.OpenDriver.driver;


public class BasePage {

    public WebDriverWait wait = new WebDriverWait(driver,60);

   OpenDriver openD = new OpenDriver();

    public void openURL(){

        driver.manage().window().maximize();
        driver.get(openD.url);
    }

    public void waitforElement(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
