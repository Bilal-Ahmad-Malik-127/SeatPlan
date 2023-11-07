
Feature: Login Feature
  I want to login the seatPlan application
  @smoke 
  Scenario: i want to login the application with valid credentials 
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then verify the the title of page is "SeatPlan | Book the Best Theatre Tickets by Seat View"
    Then close the driver
  
  @DataDriven
  Scenario Outline: i want login the application with different login credentials Data Driven
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username <user>
    And enter the password <pass>
    And click on login 
    Then verify the the title of page is "SeatPlan | Book the Best Theatre Tickets by Seat View"
    Then close the driver
    Examples:
    |user             |pass|
    |"dev"            |"devils1"|
    |"adminnew"				|"admin2new"|
    |"dev"					  |"devils"|
