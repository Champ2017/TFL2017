package Package_com.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by P on 16/07/2017.
 */

public class EasyjetSignIn_sd {

    public WebDriver driver;

    @Given("^I entered url \"([^\"]*)\"$")

    public void iEnteredUrl(String url) {

//        FirefoxDriverManager.getInstance().setup();

//         driver = new FirefoxDriver();

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        driver.get(url);
    }

    @And("^I accept the cookies$")
    public void iAcceptTheCookies() throws InterruptedException {

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Thread.sleep(2000);
//      driver.findElement(By.cssSelector(".main-navigation-group .first-level-item .ej-button")).click();
        driver.findElement(By.xpath(".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/button")).click();
    }


    @And("^I click on Sign In link$")
    public void iClickOnSignInLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='pageWrapper']/div[2]/div[1]/div[1]/div[3]/ul/li[2]/h3/a[2]/span[1]")).click();

    }

    @And("^I enter \"([^\"]*)\" as email address$")
    public void iEnterAsEmailAddress(String Email) throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("signin-username")).sendKeys(Email);

    }

    @And("^I enter \"([^\"]*)\" as password$")
    public void iEnterAsPassword(String Password) throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("signin-password")).sendKeys(Password);

    }


    @When("^I click on Sign In button$")
    public void iClickOnSignInButton() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("signin-login")).click();

    }

//    @Then("^I should see \"([^\"]*)\" page$")
//    public void iShouldSeePage(String Actual_text) {
//
////        String Expected_text = "My bookings";
////
////        System.out.println("Expected_text====>"+Expected_text);
////        System.out.println("Actual_text===>"+Actual_text);
////
////        Actual_text = driver.findElement(By.id("mainHeading")).getText();
////
////        Assert.assertEquals(Expected_text, Actual_text);
//
////        System.out.println("Expected_text===>"+Expected_text)
////        System.out.println("Actual_text ===>"+Actual_text)
//
//        String S;
//        S = driver.getTitle();
//        System.out.println(S);



    }





