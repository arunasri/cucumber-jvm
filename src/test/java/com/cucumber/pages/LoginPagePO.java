package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {
	public LoginPagePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'authentication_username']")
	public WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@id = 'authentication_password']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value = 'Login']")
	public WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//input[@type = 'checkbox']")
	public WebElement rememberMeCheckBox;

	@FindBy(how = How.XPATH, using = "Forgot Password?")
	public WebElement forgotPasswordLink;
}
