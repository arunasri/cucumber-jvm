package stepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FatFreeCRMLoginTest_StepDefi {
	WebDriver driver = null;

	@Given("^user is on login page$")
	public void user_is_on_Login_Page() throws MalformedURLException {
		driver = new ChromeDriver();
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		driver.get("http://qacrm.herokuapp.com/login");
	}
	
	@When("^title of login page is fat free crm$")
	public void title_of_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Fat Free CRM", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_password() {
		driver.findElement(By.xpath("//input[@name = 'authentication[username]']")).sendKeys("heather");
		driver.findElement(By.xpath("//input[@name = 'authentication[password]']")).sendKeys("heather");
	}
	
	@Then("^user click on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@name = 'commit']")).click();
	}
		
	@SuppressWarnings("deprecation")
	@And("^user is on dashboard page$")
	public void user_is_on_dasboard_page() {
		String title = driver.getTitle();
		System.out.println("welcome_username :: "+title);
		
		Assert.assertEquals("Fat Free CRM",title);
	}
	
	@And("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
