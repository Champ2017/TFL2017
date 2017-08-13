import Package_com.OpenDriver;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    OpenDriver openD = new OpenDriver();


    @Before

    public void openBrowser() throws IOException {

        openD.openbrowser();
    }

//    @After

//    public void quitBrowser(){
//
//        openD.closebrowser();
//    }
}
