package Package_com.pages;

import Package_com.utils.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TFLJourneyplanner_page extends BasePage {

    @FindBy(id = "InputFrom")
    private WebElement fromField;

    @FindBy(id="InputTo")
    private WebElement toField;

    public void input_from(String from){
//        driver.findElement(By.id("InputFrom")).sendKeys(from+ Keys.ESCAPE);

        waitforElement(fromField);
        fromField.sendKeys(from+ Keys.ESCAPE);

    }

    public void input_to(String to){
//        driver.findElement(By.id("InputTo")).sendKeys(arg0+ Keys.ESCAPE);
        waitforElement(toField);
        toField.sendKeys(to+ Keys.ESCAPE);

    }

}
