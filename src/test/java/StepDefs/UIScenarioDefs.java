package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import Utils.commonDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UIScenarioDefs extends commonDriver{
	
	//Common step definition to get any url
	@Given("^I am on \"([^\"]*)\"$")
	public void i_am_on(String url) throws Throwable {
		driver.get(url);		
	   
	}
	
	//Scenario 1 Step definitions
	
	@Given("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		WebElement searchField = driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
		searchField.sendKeys("Halifax");
		searchField.sendKeys(Keys.ENTER);
	
	}

	@When("^I click Halifax website link from the result$")
	public void i_click_Halifax_website_link_from_the_result() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
			
	}

	@Then("^I should see Halifax homepage$")
	public void i_should_see_Halifax_homepage() throws Throwable {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("halifax.co.uk/"));

	}
	
	//Scenario 2 Step definitions

	@Given("^I cick on personal internet banking$")
	public void i_cick_on_personal_internet_banking() throws Throwable {
	   driver.findElement(By.xpath(".//*[@id='c1425473242018']/div/ul[1]/li[1]/a")).click();
	   
	}

	@Then("^I should see personal internet banking page$")
	public void i_should_see_personal_internet_banking_page() throws Throwable {
		String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("online.lloydsbank.co.uk/personal/logon"));
	}

	@Given("^I click on business internet banking page$")
	public void i_click_on_business_internet_banking_page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='c1425473242018']/div/ul[1]/li[2]/a")).click();
		
	}

	@Then("^I should see business internet banking page$")
	public void i_should_see_business_internet_banking_page() throws Throwable {
		String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("onlinebusiness.lloydsbank.co.uk/business/logon"));
	}
	
	//Scenario 3 Step Definitions

	@Given("^I click on Contact us page$")
	public void i_click_on_Contact_us_page() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='c1425473242096']/div/div/div[3]/div/div/div/div[2]/ul/li[1]/a/span[2]")).click();
	    
	}

	@When("^I scroll down to see all the (\\d+) options$")
	public void i_scroll_down_to_see_all_the_options(int arg1) throws Throwable {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='c1424032985476']/div/div/ul/li/a"));
		scroll.executeScript("arguments[0].scrollIntoView(true);",element);
		
	    
	}

	@Then("^I should be able to see all the (\\d+) options in (\\d+) view$")
	public void i_should_be_able_to_see_all_the_options_in_view(int arg1, int arg2) throws Throwable {
	    WebElement callLloyds = driver.findElement(By.xpath(".//*[@id='c1426866311158']/div/div/div/h3"));
	    WebElement cardLost = driver.findElement(By.xpath(".//*[@id='c1424032985461']/div/div/div/h3"));
	    WebElement suspAct = driver.findElement(By.xpath(".//*[@id='c1424969037172']/div/div/div/h3"));
	    WebElement askQues = driver.findElement(By.xpath(".//*[@id='c1424032985476']/div/div/ul/li/a"));
	    WebElement selfServ = driver.findElement(By.xpath(".//*[@id='c1424032985477']/div/div/ul/li/a"));
	    WebElement Complnt = driver.findElement(By.xpath(".//*[@id='c1426453216156']/div/div/ul/li/a"));
	    
	    Assert.assertEquals(true, callLloyds.isDisplayed());
	    Assert.assertEquals(true, cardLost.isDisplayed());
	    Assert.assertEquals(true, suspAct.isDisplayed());
	    Assert.assertEquals(true, askQues.isDisplayed());
	    Assert.assertEquals(true, selfServ.isDisplayed());
	    Assert.assertEquals(true, Complnt.isDisplayed());
	    
	}


	
}
