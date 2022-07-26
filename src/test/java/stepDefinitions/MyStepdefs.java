package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CalendarPage;
import page.FacilitiesPage;
import page.LoginPage;

public class MyStepdefs {
   private LoginPage loginPage=new LoginPage();
   private CalendarPage calendarPage=new CalendarPage();
   private FacilitiesPage facilitiesPage=new FacilitiesPage();
    @Given("user on the login page with a valid user name and valid Password.")
    public void userOnTheLoginPageWithAValidUserNameAndValidPassword() {

    loginPage.land();

    }
 @When("user enters username and password and click on the login button.")
 public void userEntersUsernameAndPasswordAndClickOnTheLoginButton() {
  loginPage.land();
  loginPage.loginInfoSet();
  loginPage.clickLoginButton();
 }


    @Then("verify that user successfully navigated to the ‘Calendar Page’.")
    public void verifyThatUserSuccessfullyNavigatedToTheCalendarPage() throws InterruptedException {
       calendarPage.verifyCalendarPage();
    }

    @Given("user on Calendar Page.")
    public void userOnCalendarPage() {
    }

    @When("user hover over to admin page.")
    public void userHoverOverToAdminPage() {
    }

    @And("user should be able to see dropdown options")
    public void userShouldBeAbleToSeeDropdownOptions() {
    }

    @Then("user should be able to hover to clinic section.")
    public void userShouldBeAbleToHoverToClinicSection() {
    }

    @And("user should be able to click on Facilities")
    public void userShouldBeAbleToClickOnFacilities() {
    }

    @Then("verify that user successfully navigated to the {string}.")
    public void verifyThatUserSuccessfullyNavigatedToTheFacilitiesPage(String str) {
        System.out.println(str);
    }







    @Given("user on the Facilities Page.")
    public void userOnTheFacilitiesPage() throws InterruptedException {
        calendarPage.goFacility();

    }

    @When("user click on add Facility button")
    public void userClickOnAddFacilityButton()  {
        facilitiesPage.clickAddFacility();
    }

    @Then("verify that user should be able to see Add Facility Popup")
    public void verifyThatUserShouldBeAbleToSeeAddFacilityPopup() {
       facilitiesPage.verifyPopUpTitle();
    }

    @Given("user on Add Facility Popup.")
    public void userOnAddFacilityPopup() throws InterruptedException {
        calendarPage.goFacility();
        facilitiesPage.clickAddFacility();

    }

    @Then("verify that  user should be able to see the respective fields that exist on the page by following:{string}, {string}, {string}, {string}, {string},{string}")
    public void verifyThatUserShouldBeAbleToSeeTheRespectiveFieldsThatExistOnThePageByFollowing(String Name,String Tax_ID,String NPI,String Billing_Addres,String Mailing_Adress,String Phone) {
   facilitiesPage.verifyRespectiveFields(Name,Tax_ID,NPI,Billing_Addres,Mailing_Adress,Phone);
    }
    @When("user enter required fields.   {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userEnterRequiredFields(String Name,String Tax_ID,String NPI,String Billing_Addres,String Mailing_Adress,String Phone,String color) {
   facilitiesPage.setRequiredFields(Name,Tax_ID,NPI,Billing_Addres,Mailing_Adress,Phone,color);
    }

    @And("user clicks on the save button")
    public void userClicksOnTheSaveButton() throws InterruptedException {
        facilitiesPage.clickSave();
    }



   @Then("verify that the saved Facility should appear on the Facility table with populated-stored data that it been entered")
   public void verifyThatTheSavedFacilityShouldAppearOnTheFacilityTableWithPopulatedStoredDataThatItBeenEntered() {

   }


}
