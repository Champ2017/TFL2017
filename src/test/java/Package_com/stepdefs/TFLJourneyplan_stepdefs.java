package Package_com.stepdefs;

import Package_com.OpenDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class TFLJourneyplan_stepdefs extends OpenDriver {


    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String arg0) {

//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();

        driver.get(arg0);
    }

    @And("^I enter \"([^\"]*)\" in the From field$")
    public void iEnterInTheFromField(String arg0) {

        driver.findElement(By.id("InputFrom")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" in the To field$")
    public void iEnterInTheToField(String arg0) {

        driver.findElement(By.id("InputTo")).sendKeys(arg0);
    }

    @When("^I click on Plan My Journey button$")
    public void iClickOnPlanMyJourneyButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("html/body/div[3]/div[4]/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/div[3]/form/div/div[1]/div/fieldset/input")).click();

      driver.findElement(By.xpath(".//*[@id='plan-a-journey']/fieldset/input")).click();

    }

    @Then("^I should see \"([^\"]*)\" page$")
    public void iShouldSeePage(String Expected_text) {

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String Actual_text = driver.findElement(By.xpath(".//*[@id='full-width-content']/div/div[2]/div/h1/span")).getText();

        System.out.println("Expected_text====>"+Expected_text);
        System.out.println("Actual_text===>"+Actual_text);

        assertEquals(Expected_text,Actual_text);

    }

    @And("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String Exp_text) {

        String Act_Text = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[1]/strong")).getText();
        System.out.println("Expected_Text   :"+Exp_text);
        System.out.println("Actual_Text    :"+Act_Text);

        assertEquals(Exp_text,Act_Text);
    }

    @And("^I should see \"([^\"]*)\" in destination$")
    public void iShouldSeeInDestination(String Exptext) {

        String Acttext = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[2]/strong")).getText();
        System.out.println("Expected_Text   :"+Exptext);
        System.out.println("Actual_Text    :"+Acttext);

        assertEquals(Exptext,Acttext);
    }


    @And("^I should see \"([^\"]*)\" link$")
    public void iShouldSeeLink(String Exptext) {

//        String Acttext = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[3]/a[1]/span")).getText();
//        System.out.println("Expected_Text   :"+Exptext);
//        System.out.println("Actual_Text    :"+Acttext);
//
//        assertEquals(Exptext,Acttext);

          Boolean link = driver.findElement(By.linkText("Edit journey")).isDisplayed();
          System.out.println(link);
    }

    @And("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String Exptext) {

        String Acttext = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[3]/div[2]/div/div")).getText();
        assertTrue(Acttext.matches(Exptext));

    }

    @And("^I should see \"([^\"]*)\" hyperlink$")
    public void iShouldSeeHyperlink(String Exptext) {

        String Acttext = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[3]/div[4]/a")).getText();
        assertTrue(Acttext.matches(Exptext));

    }


    @And("^the url should contain the text \"([^\"]*)\"$")
    public void theUrlShouldContainTheText(String Exptext)  {

        String Acttext = driver.getCurrentUrl();
        assertTrue(Acttext.contains(Exptext));

    }

}

