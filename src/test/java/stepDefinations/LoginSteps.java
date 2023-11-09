package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Login;
import pageObjects.footersPage;

public class LoginSteps {

	WebDriver driver ;
	Login lp;
	footersPage fp;
	

   
	@Given("open the chrome browser")
	public void open_the_chrome_browese() {
		driver= new ChromeDriver();
		lp = new Login(driver);
		System.out.println("open chrome");

	}

	@And("enter the url {string}")
	public void enter_the_url(String url) {
		lp.enterUrl(url);

	}

	@And("enter the username {string}")
	public void enter_the_username(String user) {
		lp.enterUsername(user);
	}

	@And("enter the password {string}")
	public void enter_the_password(String pass) {
		lp.enterPassword(pass);
	}

	@And("click on login")
	public void click_on_login() {
		lp.login("uat.seatplan.com");
	}

	@Then("verify the the title of page is {string}")
	public void verify_the_the_title_of_page_is(String string) {
		lp.verifyTitle(string);

	}

	@Then("close the driver")
	public void closeDriver() {
		driver.close();
	}

//	***************** Footer Section**********************

//  ***************************** About *******************

	@Then("click on About")
	public void click_on_about() {
		fp = new footersPage(driver);
		fp.click_on_about();

	}
//****************************** FAQ *********************

	@Then("click on FAQ")
	public void click_on_faq() {
		fp = new footersPage(driver);
		fp.click_on_faq();

	}

//****************************** CAREERS *********************

	@Then("click on Careers")
	public void click_on_careers() {
		fp = new footersPage(driver);
		fp.click_on_Careers();
	}

//****************************** COMPETATIONS *********************

	@Then("click on Competations")
	public void click_on_Competations() {
		fp = new footersPage(driver);
		fp.click_on_Competitions();

	}



//******************** BackStage ************************
	
	@Then("click on backstage")
	public void click_on_backstage() {
		fp = new footersPage(driver);
		fp.click_on_backstage();
	}
	
	
	
//****************** Venue map ***************************
	@Then("click on venue and enter {string}")
	public void click_on_venue_and_enter(String string) throws InterruptedException {
		fp = new footersPage(driver);
		fp.click_on_venue_and_enter(string);	
	}
	
	@Then("down the arrow key it will select the top and click on it")
	public void down_the_arrow_key_it_will_select_the_top_and_click_on_it() throws InterruptedException {
		fp.down_the_arrow_key_it_will_select_the_top_and_click_on_it();
	}
	
	@Then("check A google map is  embed displays the location of the venue")
	public void check_a_google_map_is_embed_displays_the_location_of_the_venue()
	{
		fp.check_a_google_map_is_embed_displays_the_location_of_the_venue();
	}
	
		//************************* Search Test Venue And Production****************//
	
	@Then("Selecting a search result will take you to the relevant production")
	public void Selecting_a_search_result_will_take_you_to_the_relevant_production()
	{
		fp.Selecting_a_search_result_will_take_you_to_the_relevant_production();
	}

		//*************************Ticketing calendar**********************//
		
	
	@Then("Navigate to production page")
	public void Navigate_to_production_page () {
	//System.out.println(driver);
	//	System.out.println("Navigate");
		fp= new footersPage(driver);
		fp.Navigate_to_production_page();
		
	}
	
	@And("Ability to change month using month selector")
	public void Ability_to_change_month_using_month_selector() 
	{
		fp.Ability_to_change_month_using_month_selector();
	}
	
	@And("Availibility of time, price, indicator on the top left of each card")
	public void Availibility_of_time_price_indicator_on_the_top_left_of_each_card()
	{
		fp.Availibility_of_time_price_indicator_on_the_top_left_of_each_card();
	}
	
	@And("Selecting a performance will take a user to the ticketing seat map for the date and time selected")
	public void Selecting_a_performance_will_take_a_user_to_the_ticketingseat_map_for_the_date_and_time_selected()
	{
		fp.Selecting_a_performance_will_take_a_user_to_the_ticketingseat_map_for_the_date_and_time_selected();
		
		Assert.assertEquals(driver.getTitle(), "Select Seat | 2:30pm 9th Nov | Hamilton Tickets | London Theatre | SeatPlan");
	}

	
	
}
