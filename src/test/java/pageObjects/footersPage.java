package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footersPage {

	WebDriver driver;
	Actions action;

	@FindBy(xpath = "//li/a[text()='About']")
	WebElement about;

	@FindBy(xpath = "//li/a[text()='FAQ']")
	WebElement faq;

	@FindBy(xpath = "//li/a[text()='Careers']")
	WebElement careers;

	@FindBy(xpath = "//li/a[text()='Competitions']")
	WebElement Competitions;

	@FindBy(xpath = "//a[text()='Backstage']")
	WebElement backstage;

	@FindBy(xpath = "//div[@id='page-wrap']/descendant::input[2]")
	WebElement search;
	
	@FindBy(xpath="//div[@class='info-blocks__item'][2]")
	WebElement map;
	
	@FindBy(xpath="//*[@alt='Hamilton']")
	WebElement production;
	
	@FindBy(xpath="//*[@class='button button-primary production-right-panel__btn']")
	WebElement ticket;
	
	@FindBy(id="production-month-year")
	WebElement month;
	
	@FindBy(xpath="//*[@id=\"calendar-wrapper\"]/ul[2]/li[4]/div/div[2]/a[1]/span")
	WebElement availibility;
	
	@FindBy(xpath="//*[@id=\"calendar-wrapper\"]/ul[2]/li[4]/div/div[2]/a[1]/em")
	WebElement time;
	
	@FindBy(xpath="//div[@id='calendar-wrapper']//ul[@class='calendar-row'][1]//li[4]//span[@class='cal-day-number']")
	WebElement date;
	
	@FindBy(xpath="//div[@id='calendar-wrapper']//ul[@class='calendar-row'][1]//li[4]//a[1]")
	WebElement ticketnav;
	
	
	
	
	

	public void click_on_about() {
		about.click();
	}

	public void click_on_faq() {
		faq.click();
	}

	public void click_on_Careers() {
		{
			careers.click();
		}
	}

	public void click_on_Competitions() {
		Competitions.click();
	}

//*********** backstage****************
	public void click_on_backstage() {
		backstage.click();
	}

	// ***********map**************
	public void click_on_venue_and_enter(String place) throws InterruptedException {

		search.click();
		search.sendKeys(place);
		Thread.sleep(3000);

	}

	public void down_the_arrow_key_it_will_select_the_top_and_click_on_it() throws InterruptedException {
		action.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
	}
	
	public void check_a_google_map_is_embed_displays_the_location_of_the_venue()
	{
		map.click();
     	//Assert.assertTrue(driver.getPageSource().contains());
	}
	

	public footersPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

	}
	
	//*************************Search***********************//
	
	public void Selecting_a_search_result_will_take_you_to_the_relevant_production()
	{
		for (int i = 0; i <4; i++) {
		    action.sendKeys(Keys.DOWN);
		}
		action.sendKeys(Keys.ENTER).perform();
	}
	
	//************************Start of Ticketing calendar****//
	//************************Production page****************//
	
	public void Navigate_to_production_page () 
	{
		   production.click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		   ticket.click();
	}
	
	//************************Production Month Change****************//
	
	public void Ability_to_change_month_using_month_selector() 
	{
		month.click();
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	//************************ Availability of Date Time and Indicator****************//

	public void Availibility_of_time_price_indicator_on_the_top_left_of_each_card()
	{
		availibility.isDisplayed();
		time.isDisplayed();
		date.isDisplayed();
	
	}
	
	public void Selecting_a_performance_will_take_a_user_to_the_ticketingseat_map_for_the_date_and_time_selected()
	{
		ticketnav.click();
	}
				//************************End of Ticketing calendar****************//
	
	


}
