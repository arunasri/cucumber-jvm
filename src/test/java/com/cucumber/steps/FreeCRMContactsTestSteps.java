package com.cucumber.steps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FreeCRMContactsTestSteps {
	WebDriver driver = null;

	public WebDriver getCurrentDriver() throws MalformedURLException {
		String runningLocally = System.getProperty("RUN_LOCALLY");
		if (runningLocally != null) {
			return new ChromeDriver();
		}

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("no-sandbox");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return new RemoteWebDriver(new URL("http://52.87.214.146:4444/wd/hub"), capabilities);
	}

	@Given("^user is already on login page$")
	public void user_is_on_login_page() throws MalformedURLException {
		driver = this.getCurrentDriver();
		String serverURL = System.getProperty("SERVER_URL");
		System.out.println(serverURL);
		driver.get(serverURL + "/login");
	}

	@When("^title of login page is Fat Free CRM$")
	public void verify_title_fat_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Fat Free CRM", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user click on tasks tab$")
	public void user_click_on_tasks_tab() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user is on tasks page$")
	public void user_is_on_tasks_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user clicks on create task link$")
	public void user_clicks_on_create_task_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user enters create task details \"([^\"]*)\"$")
	public void user_enters_create_task_details(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user select due as this week$")
	public void user_select_due_as_this_week() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user select assignto as myself$")
	public void user_select_assignto_as_myself() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user select category as email$")
	public void user_select_category_as_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^click on create task button$")
	public void click_on_create_task_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user clicks on login button$")
	public void click_on_login_button() {
		WebElement loginButon = driver
				.findElement(By.xpath("//div[@class = 'input-group-btn']//following-sibling::input"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", loginButon);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page Title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contacts_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")))
				.moveToElement(driver.findElement(By.xpath("//a[@title = 'New Contact']"))).click().build().perform();
	}

	@Then("^user enters contacts details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contacts_details(String firstname, String lastname, String position) {
		driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name = 'surname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name = 'company_position']")).sendKeys(position);
		driver.findElement(By.xpath("//input[@value = 'Save']")).click();
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
