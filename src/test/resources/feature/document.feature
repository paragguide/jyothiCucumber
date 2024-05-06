Feature: Amazon Document
  I want to use this template for amazon testing
   
  @amazon @uid
  Scenario: Test userid
    Given I open "chrome" browser wuth url "https://www.amazon.in" make report "LoginReport"
    And i click sign in link
    When I enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then I validate the userid is correct
   
   @amazon @pwd 
   Scenario: Test Password  
    Given userid is valid
    When i enter password "RMinfotechh"
    Then i should login
    
    @amazon @shop
    Scenario Outline: Shop test
     Given user in logged in
     When i search product <product> in range <price>
     Then results come
     
    Examples:
    | product | price |
    | Shirt | 3000 |
    | pant | 5000 |
    | tie | 1000 |
    
    @amazon @forget
    Scenario: Forget Test
     Given browser "chrome" is open with url "https://www.amazon.in"
     And click signin
     When click help and click forget
     And enter email in textbox
     And click button
     Then recover password

  