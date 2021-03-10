package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import java.util.concurrent.TimeUnit;

import baseTests.BaseClass;
import utilities.Utilities;

public class TheRemoteCompanyTests extends BaseClass {
	Utilities util=new Utilities();
	
	@Test(priority=1)
	public void verifyValidLogin() throws Exception //verify valid login
	{
		loginPageObject.enterEmail(driver,read.getEmail());
		testInfo.log(Status.INFO,"Entering email: "+read.getEmail());
		
		loginPageObject.enterPassword(driver, read.getPassword());
		testInfo.log(Status.INFO,"Entering password: "+read.getPassword());
		
		loginPageObject.clickOnLogin(driver);	
		testInfo.log(Status.INFO,"Clicking on login button");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("")).getText().contains("")); //Xpath for any element present on welcome page and the text that element has
		testInfo.log(Status.INFO,"User is logged In");
	}
	
	@Test(priority=2)
	public void verifyValidSignUp() throws Exception //verify valid signup
	{
		loginPageObject.clickOnSignUp(driver);
		testInfo.log(Status.INFO, "Clicking on SignUp");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		signUpPage.enterCompany(driver, read.getCompany());
		testInfo.log(Status.INFO, "Entering First Name: " +read.getCompany());
		
		signUpPage.enterEmail(driver, read.getEmailSignUp());
		testInfo.log(Status.INFO, "Entering Email: " +read.getEmailSignUp());
		
		signUpPage.enterPassword(driver, read.getPasswordSignUp());
		testInfo.log(Status.INFO, "Entering Password: " +read.getPasswordSignUp());
		
		signUpPage.clickOnSignUpButton(driver);
		testInfo.log(Status.INFO,"Clicking on Sign Up Button");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.xpath("")).getText().contains("")); //Xpath for any element present on welcome page and the text that element has
		testInfo.log(Status.INFO,"User is signed up");
	}
	
}