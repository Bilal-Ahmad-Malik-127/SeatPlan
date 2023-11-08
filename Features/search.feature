Feature:  Users can only search for productions or venues
  @searchVenue
  Scenario: Users can only search for productions or venues
  	Selecting an autocomplete option will take you to the relevant production or venue page
    
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on venue and enter "lo"
    Then down the arrow key it will select the top and click on it 
    Then verify the the title of page is "London Palladium Events & Tickets 2023-2024"
    Then close the driver
    
    
   @searchProduction
    Scenario: Users can only search for productions
  	Selecting a search result will take you to the relevant production
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on venue and enter "lo"
    Then Selecting a search result will take you to the relevant production
    Then verify the the title of page is "Long Day's Journey into Night Tickets - Brian Cox - London"
    Then close the driver