package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	Logger logger;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger=Logger.getLogger(this.getClass());
	}
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath="//input[@id='password-1']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit-button']")
	WebElement submitButton;
	
	public void enterCompany(WebDriver driver, String str) 
	{
		logger.info("Company is entered: " +str);
		company.sendKeys(str);
	}
	
	public void enterEmail(WebDriver driver, String str) 
	{
		logger.info("Email is entered: " +str);
		email.sendKeys(str);
	}
	
	public void enterPassword(WebDriver driver, String str) 
	{
		logger.info("Password is entered: " +str);
		password.sendKeys(str);
	}
	
	public void clickOnSignUpButton(WebDriver driver) 
	{
		logger.info("Clicked on Sign Up Button");
		submitButton.click();
	}
	
}
