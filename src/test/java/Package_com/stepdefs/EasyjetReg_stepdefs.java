package Package_com.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class EasyjetReg_stepdefs {

    public WebDriver driver;

    @Given("^I entered url as \"([^\"]*)\"$")
    public void iEnteredUrlAs(String url)  {

        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();

        driver.get(url);
    }


    @And("^I enter \"([^\"]*)\" email address$")
    public void iEnterEmailAddress(String emailId)  {

        driver.findElement(By.id("EmailAddress")).sendKeys(emailId);
    }


    @And("^I enter \"([^\"]*)\" as confirm email address$")
    public void iEnterAsConfirmEmailAddress(String emailid)  {

        driver.findElement(By.id("EmailAddressCheck")).sendKeys(emailid);
    }

    @And("^I enter \"([^\"]*)\" in password$")
    public void iEnterInPassword(String arg0)  {

        driver.findElement(By.id("Password")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" as confirm password$")
    public void iEnterAsConfirmPassword(String arg0)  {

        driver.findElement(By.id("PasswordCheck")).sendKeys(arg0);
    }

    @And("^I select \"([^\"]*)\" for title$")
    public void iSelectForTitle(String arg0)  {

        Select dropdown = new Select(driver.findElement(By.id("TitleTypeCode")));
        dropdown.selectByIndex(1);

    }

    @And("^I enter \"([^\"]*)\" as First Name$")
    public void iEnterAsFirstName(String arg0)  {

        driver.findElement(By.id("FirstName")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" as Surname$")
    public void iEnterAsSurname(String arg0)  {

        driver.findElement(By.id("LastName")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" in Address$")
    public void iEnterInAddress(String arg0)  {

        driver.findElement(By.id("Address1")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" in Address contd$")
    public void iEnterInAddressContd(String arg0)  {

        driver.findElement(By.id("Address2")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" in Town$")
    public void iEnterInTown(String arg0)  {

        driver.findElement(By.id("City")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" in Postcode$")
    public void iEnterInPostcode(String arg0)  {

        driver.findElement(By.id("PostalCode")).sendKeys(arg0);
    }

    @And("^I enter \"([^\"]*)\" as mobile number$")
    public void iEnterAsMobileNumber(String arg0)  {

        driver.findElement(By.id("MobilePhone")).sendKeys(arg0);
    }

    @And("^I select the Optout checkbox$")
    public void iSelectTheOptoutCheckbox()  {

        driver.findElement(By.id("OptInEasyJetMailingListCheckBox")).click();
    }

    @When("^I click on Register Now button$")
    public void iClickOnRegisterNowButton()  {

        driver.findElement(By.id("btnRegister")).click();
    }

    @Then("^I should see \"([^\"]*)\" details page$")
    public void iShouldSeeDetailsPage(String arg0)  {

        arg0 = driver.getTitle();
        System.out.println("Page Title is: " +arg0);

        assertEquals("My account details - My account - easyjet.com", arg0);
        assertTrue( arg0.contains("easyjet.com"));

        driver.close();
    }



}


