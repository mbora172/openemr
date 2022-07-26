package stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Base;
import utils.Driver;

public class Hook extends Base {
    @Before
    public void setup(){
        Driver.getDriver();
        waitImplicit();
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
    }

}
