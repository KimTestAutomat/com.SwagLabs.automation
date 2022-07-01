package com.SwagLabs.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.automation.utils.BasePage;

public class TestPageObject extends BasePage {

	
	public TestPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	/* Locators */
	final static String USER_NAME = "user-name";
	final static String PASS = "password";
	final static String LOGIN = "login-button";
	final static String ALERT = "//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]";
	final static String PRODUCT = ".text-transform";
	
	
	/* FindBy */
	@FindBy(how = How.ID, using = USER_NAME)
	public static WebElement userName;
	@FindBy(how = How.ID, using = PASS)
	public static WebElement password;
	@FindBy(how = How.ID, using = LOGIN)
	public static WebElement log;
	@FindBy(how = How.XPATH, using = ALERT)
	public static WebElement msg;
	@FindBy(how = How.CSS, using = PRODUCT)
	public static WebElement prdt;


	/* Methods */
	public void clickOn() {
		log.click();
	}

	public void fillField(String user , String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);

	}


	public String checkFieldContain(WebElement errorMsg) {
		String text = errorMsg.getText();
		return text;
	}
	
}
