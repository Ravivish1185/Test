package CucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class annotation { 
	WebDriver driver = null; 

	@Given("^I have open the browser$")
	public void I_have_open_the_browser() throws Throwable 
	{
		// Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.chrome.driver", "D:\\FrameWork\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//throw new PendingException();
	}

	@When("^I open Facebook website$")
	public void I_open_Facebook_website() throws Throwable 
	{
		// Express the Regexp above with the code you wish you had
		driver.navigate().to("https://www.makemytrip.com"); 
		//throw new PendingException();
	}


	@When("^Search for flights details$")
	public void Search_for_flights_details() throws Throwable {
		// Express the Regexp above with the code you wish you had
		
		//throw new PendingException();
	}

	@When("^Close$")
	public void Close() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@When("^before Close$")
	public void before_Close() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Then("^Login button should exits$")
	public void Login_button_should_exits() throws Throwable 
	{
		// Express the Regexp above with the code you wish you had
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).isEnabled()) 
		{ 
			System.out.println("Test 1 Pass"); 
		} else { 
			System.out.println("Test 1 Fail"); 
		} 
		driver.quit(); 
		//throw new PendingException();
	}

}