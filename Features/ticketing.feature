	Feature: Tcalender
	@Tcalender
 	Scenario: Ability to change month using month selector
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then Navigate to production page
    And Ability to change month using month selector 
   
   @DateTimeIcon
   Scenario: Availibility of time, price, indicator on the top left of each card
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then Navigate to production page
    And Availibility of time, price, indicator on the top left of each card
		And Selecting a performance will take a user to the ticketing seat map for the date and time selected