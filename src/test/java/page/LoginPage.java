package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import utils.Base;
import utils.ConfigurationReader;
import utils.Driver;


// page_url = https://openemr.renastechschool.com/interface/login/login.php?site=default
//username=renastech
//password=dru$*Lpz!E2VAWG?
public class LoginPage extends Base {
    @FindBy(id = "authUser")
    private WebElement authuserInput;

    @FindBy(id = "clearPass")
    private WebElement clearpassInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;
    public void land(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    // No page elements added
    public void loginInfoSet(){

        authuserInput.sendKeys(ConfigurationReader.getProperties("username"));
        clearpassInput.sendKeys(ConfigurationReader.getProperties("password"));

    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void login(){
        land();
        loginInfoSet();
        loginButton.click();
    }

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}