@smokeTest
  Feature: Varify login function in OrangeHRM web application
  Scenario: Successfully login to OrangeHRM web application   
    Given User go to OrangeHRM demo home page
    When User type the username in the username field
    #And User click on the password field
    And User type the password in the password field
    Then User click on the Login button
    
    