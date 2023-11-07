package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
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
}
