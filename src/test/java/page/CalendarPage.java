package page;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import utils.Base;
import utils.Driver;
//username=renastech
//password=dru$*Lpz!E2VAWG?

// page_url = https://openemr.renastechschool.com/interface/main/tabs/main.php?token_main=MYoRsVk1vWImNiynaOVkuj7tEDP9fqdKQKu03YaG
public class CalendarPage extends Base {
    private LoginPage loginPage=new LoginPage();
    @FindBy(id = "logoutinnerframe")
    private WebElement logoutinnerframeIframe;
    @FindBy(css = "span.tabTitle.pr-2")
    private WebElement tabTitle;
    //span[contains(text(),'Facilities')]


    @FindBy(xpath = "//body/div[@id='mainBox']/nav[1]/div[1]/div[1]/div[10]/div[1]/div[1]")
    private WebElement dropdownAdmin;

    @FindBy(xpath = "//body/div[@id='mainBox']/nav[1]/div[1]/div[1]/div[10]/div[1]/ul[1]/li[2]/div[1]/div[1]")
    private WebElement dropdownAdminClinic;
    //body/div[@id='mainBox']/nav[1]/div[1]/div[1]/div[10]/div[1]/ul[1]/li[2]/div[1]/div[1]

    @FindBy(xpath = "//div[contains(text(),'Facilities')]")
    private WebElement Facilities;
    //div[contains(text(),'Facilities')]
    public void verifyCalendarPage() throws InterruptedException {

      Assert.assertTrue(tabTitle.getText().contains("Calendar"));
        System.out.println(tabTitle.getText());
    }
//body/div[@id='mainBox']/nav[1]/div[1]/div[1]/div[10]/div[1]/div[1]
    // No page elements added


    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        loginPage.login();
    }
    public void goFacility() throws InterruptedException {
        waitStatic(3);
        dropdownAdmin.click();
        dropdownAdminClinic.click();
        Facilities.click();
    }
//    @Test
//    public void tc() throws InterruptedException {
//        dropdownAdmin.click();
//        dropdownAdminClinic.click();
//        Facilities.click();
//    }
}