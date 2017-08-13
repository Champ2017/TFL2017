package Package_com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OpenDriver {

       public static WebDriver driver;
       public static String url;

//       Open Browser
              public void openbrowser() throws IOException {

              String browser = System.getProperty("browser");

              String environ = System.getProperty("environment");

              String srcFolder = "src\\test\\java\\Package_com\\propertyfiles";
              String envfile = null;


              if (browser.equals("Chrome")){
                     ChromeDriverManager.getInstance().setup();
                     driver = new ChromeDriver();
              }
              else if (browser.equals("Firefox")){
                     FirefoxDriverManager.getInstance().setup();
                     driver = new FirefoxDriver();
              }
              else if (browser.equals("Safari")){
                     driver = new SafariDriver();
              }
              else if (browser.equals("IE")){
                    driver = new InternetExplorerDriver();
              }


              if (environ.toUpperCase().equals("QA")){
                  envfile = srcFolder + "\\QA.properties";
              }
              else if (environ.toUpperCase().equals("UAT")){
                  envfile = srcFolder + "\\UAT.properties";
              }
              else if (environ.toUpperCase().equals("LIVE")){
                  envfile = srcFolder + "\\Live.properties";
              }

                  FileInputStream fis = new FileInputStream(envfile);
                  Properties pro = new Properties();
                  pro.load(fis);
                   url = pro.getProperty("url");
                  System.out.println(url);


       }

//       Close Browser
//              public void closebrowser(){
//                     driver.quit();

//       }

}
