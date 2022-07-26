package page;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

import utils.Base;
import utils.Driver;
//username=renastech
//password=dru$*Lpz!E2VAWG?
//https://openemr.renastechschool.com/interface/main/tabs/main.php?token_main=t056WkSaVirymQb8Ho12gb9hzswB6SO9WuYoMvM3

// page_url = https://openemr.renastechschool.com/interface/login/login.php?site=default
public class FacilitiesPage extends Base {
    private LoginPage loginPage=new LoginPage();
    private CalendarPage calendarPage = new CalendarPage();

    @FindBy(xpath = "//a[contains(text(),'Add Facility')]")
    private WebElement addFacility;
    // No page elements added

    @FindBy(name = "adm")
    private WebElement frameFacility ;

    @FindBy(name = "facility")
    private WebElement name ;
    @FindBy(name = "street")
    private WebElement bAddress ;
    @FindBy(name = "phone")
    private WebElement phone ;
    @FindBy(css = "#ncolor")
    private WebElement color ;
    @FindBy(name = "federal_ein")
    private WebElement taxId ;
    @FindBy(name = "facility_npi")
    private WebElement npi ;
    @FindBy(name = "mail_street")
    private WebElement mAddres ;


    @FindBy(css ="label[for='street']" )
    private WebElement bAddressTitle;
    @FindBy(css ="label[for='facility']" )
    private WebElement nameTitle;
    @FindBy(css ="label[for='phone']" )
    private WebElement phoneTitle;
    @FindBy(css ="label[for='mail_stret']" )
    private WebElement mAddressTitle;
    @FindBy(css ="label[for='tax_id_type']" )
    private WebElement taxTitle;
    @FindBy(css ="label[for='facility_npi']" )
    private WebElement npiTitle;


    @FindBy(name = "city")
    private WebElement City ;
    @FindBy(name = "state")
    private WebElement State ;
    @FindBy(name = "country_code")
    private WebElement Country ;
    @FindBy(name = "website")
    private WebElement Website ;
    @FindBy(name = "iban")
    private WebElement IBAN ;

    @FindBy(name = "fax")
    private WebElement Fax ;



    @FindBy(id = "form_save")
    private WebElement save ;




    
    
    @FindBy(xpath= "//iframe[@id='modalframe']")
    private WebElement frameAddfacility ;
    //iframe[@id='modalframe']

    //h5[contains(text(),'Add Facility')]
    @FindBy(xpath = "//h5[contains(text(),'Add Facility')]")
    private WebElement popUpTitle ;

    @FindBy(id = "modalframe")
    private WebElement aDEFNanDfIframe;
    public FacilitiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickAddFacility() {
        Driver.getDriver().switchTo().frame(frameFacility);
        addFacility.click();
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandle());
        Driver.getDriver().switchTo().frame(frameAddfacility);

    }
    public void verifyPopUpTitle(){

        Assert.assertTrue(popUpTitle.getText().contains("Add Facility"));
    }
    public void verifyRespectiveFields(String Name,String Tax_ID,String NPI,String Billing_Addres,String Mailing_Adress,String Phone){
        System.out.println(bAddressTitle.getText());
        Assert.assertTrue(nameTitle.getText().contains(Name));
        Assert.assertTrue(phoneTitle.getText().contains(Phone));
        Assert.assertTrue(npiTitle.getText().contains(NPI));
        Assert.assertTrue(taxTitle.getText().contains(Tax_ID));
        Assert.assertTrue(mAddressTitle.getText().contains(Mailing_Adress));
        Assert.assertTrue(bAddressTitle.getText().contains(Billing_Addres));

    }
    public void setRequiredFields (String Name,String Tax_ID,String NPI,String Billing_Addres,String Mailing_Adress,String Phone,String color){
        name.sendKeys(Name);
        taxId.sendKeys(Tax_ID);
        npi.sendKeys(NPI);
        bAddress.sendKeys(Billing_Addres);
        mAddres.sendKeys(Mailing_Adress);
        phone.sendKeys(Phone);
        this.color.sendKeys(color);
    }
    public void clickSave() throws InterruptedException {
        waitStatic(2);
        save.click();
    }

//    @Test
//    public void TC() throws InterruptedException {
//       calendarPage.goFacility();
//    }
}