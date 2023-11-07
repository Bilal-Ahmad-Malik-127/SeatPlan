 
 @footers
 Feature: I want to see Company pages display static content about the company
 

  Scenario: To check About link is present on the webpage and it is working
   Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on About 
    Then verify the the title of page is "About Us and ie  | SeatPlan"
    Then close the driver
 
  
  Scenario: To check FAQ link is present on the webpage and it is working
   Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on FAQ 
    Then verify the the title of page is "Get Answers to All Your Frequently Asked Questions | SeatPlan"
    Then close the driver
    
Scenario: To check Careers link is present on the webpage and it is working
   Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on Careers 
    Then verify the the title of page is "Careers | SeatPlan"
    Then close the driver
    
 
Scenario: To check Competations link is present on the webpage and it is working
   Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on Competations          
    Then verify the the title of page is "Competitions & Giveaways - Win theatre vouchers and more | SeatPlan"
    Then close the driver
   
  
   Scenario: Backstage is the SeatPlan blog. Theres a blog listing page that displays a list of blog posts and then there are blog post pages displaying the blog content.
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on backstage         
    Then verify the the title of page is "SeatPlan"
    Then close the driver
 
    @new 
   Scenario: Once on a venue page the Map option is displayed in the venue menu.
    Given open the chrome browser
    And enter the url "https://uat.seatplan.com"
    And enter the username "dev"
    And enter the password "devils"
    And click on login 
    Then click on venue and enter "the other pa"
    Then down the arrow key it will select the top and click on it         
    Then check A google map is  embed displays the location of the venue
    Then verify the the title of page is "The Other Palace Address, Map & Nearest Tube | London | SeatPlan"
    Then close the driver
   
    
    