Feature:  New Facility

  Background:
#    Given user on the login page with a valid user name and valid Password.
#    When user enters username and password and click on the login button.
#    Then verify that user successfully navigated to the ‘Calendar Page’.
#    Given user on Calendar Page.
#    When user hover over to admin page.
#    And user should be able to see dropdown options
#    Then  user should be able to hover to clinic section.
#    And user should be able to click on Facilities
#    Then verify that user successfully navigated to the 'Facilities Page'.


  Scenario:
    Given user on the Facilities Page.
    When user click on add Facility button
    Then verify that user should be able to see Add Facility Popup

  Scenario:
    Given user on Add Facility Popup.
    Then verify that  user should be able to see the respective fields that exist on the page by following:"Name", "Tax ID", "NPI", "Address", "Mailing Address","Phone"

  @Smoke
  Scenario Outline:
    Given user on Add Facility Popup.
    When  user enter required fields.   "<Name>", "<Tax ID>", "<NPI>", "<Billing Address>", "<Mailing Address>", "<Phone>", "<Color>"
    And user clicks on the save button
    Then verify that the saved Facility should appear on the Facility table with populated-stored data that it been entered
    Examples:
      | Name                   | Tax ID          | NPI          | Billing Address         | Mailing Address  | Phone | Color |
      | IWroteFrameAndAutomate | EntireSubTicket | WithPreSteps | ItWassHarrdd!!ImSoTired | SeeYouNextSprint | By    | hard  |