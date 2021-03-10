package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver driver;
	Logger logger;
	
	public LoginPageObjects(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		logger=Logger.getLogger(this.getClass());
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit-btn']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[(.)='Sign up']")
	WebElement signUp;
	
	@FindBy(xpath="//a[(.)='Forgot your password?']")
	WebElement forgotPassword;
	
	public void clickOnLogin(WebDriver driver) 
	{
		logger.info("clicked on logIn option");
		loginButton.click();
	}
	
	public void enterEmail(WebDriver driver,String str) 
	{
		logger.info("Email is entered: "+str);
		username.sendKeys(str);
	}
	
	public void enterPassword(WebDriver driver,String str) 
	{
		logger.info("Password is entered: "+str);
		password.sendKeys(str);
	}
	
	public void clickOnSignUp(WebDriver driver) 
	{
		logger.info("Clicked on Sign Up");
		signUp.click();
	}
	
	public void clickOnForgotPassword(WebDriver driver) 
	{
		logger.info("Clicked on Forgot Password");
		forgotPassword.click();
	}
	
}
