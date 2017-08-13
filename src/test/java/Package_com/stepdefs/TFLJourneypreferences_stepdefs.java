package Package_com.stepdefs;

import Package_com.pages.TFLJourneyplanner_page;
import Package_com.utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static Package_com.OpenDriver.driver;

public class TFLJourneypreferences_stepdefs extends BasePage {

    public TFLJourneyplanner_page TFLJourneyplanner = PageFactory.initElements(driver,TFLJourneyplanner_page.class);

    @Given("^I enter the url$")
    public void iEnterTheUrl()  {
        openURL();
    }

    @And("^I enter \"([^\"]*)\" as the starting location$")
    public void iEnterAsTheStartingLocation(String arg0) {
          TFLJourneyplanner.input_from(arg0);

//        driver.findElement(By.id("InputFrom")).sendKeys(arg0+ Keys.ESCAPE);
    }

    @And("^I enter \"([^\"]*)\" as the destination$")
    public void iEnterAsTheDestination(String arg0) {
           TFLJourneyplanner.input_to(arg0);

//          driver.findElement(By.id("InputTo")).sendKeys(arg0+ Keys.ESCAPE);
    }

    @And("^I open the edit preferences link$")
    public void iOpenTheEditPreferencesLink() {



//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='plan-a-journey']/fieldset/div[3]/a")).click();
    }

    @And("^I select \"([^\"]*)\" option under Show me$")
    public void iSelectOptionUnderShowMe(String arg0) {
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[1]/fieldset/div/div/div[1]/label[2]")).click();

//        System.out.println(driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[1]/fieldset/div/div/div[1]/label[2]")).isSelected());
//
//        if(driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[1]/fieldset/div/div/div[1]/label[2]")).isSelected()){
//            driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[1]/fieldset/div/div/div[1]/label[2]")).click();

        }




    @And("^I select \"([^\"]*)\" option under Access options$")
    public void iSelectOptionUnderAccessOptions(String arg0) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[2]/fieldset/div/div/div[1]/label[5]")).click();

    }

    @And("^I select \"([^\"]*)\" check box$")
    public void iSelectCheckBox(String arg0)
    {
//        if (driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[3]/li[4]/div/label")).isSelected())
//
           driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[3]/li[4]/div/label")).click();

    }


    @And("^I select \"([^\"]*)\" checkbox$")
    public void iSelectCheckbox(String arg0) {

//        if (driver.findElement(By.xpath(".//*[@id='save-journey-planner-preferences']/div/label")).isSelected())

            driver.findElement(By.xpath(".//*[@id='save-journey-planner-preferences']/div/label")).click();
        }

}
