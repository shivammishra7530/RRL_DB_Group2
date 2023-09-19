package StepDefinition;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


import PageFactory.SignupPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AAA_Sindhu_StepDefinition extends Driver{

	UUID uuid = UUID.randomUUID();
	//private Scenario scenario;
	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
	} 
		SignupPage signupPage = new SignupPage(driver);{
	     signupPage.clickSigUpHere();
	     logger.info("User Register Button");
	    
		
	}

	@And("the user should be on the registration page")
	public void the_user_should_be_on_the_registration_page() {
	  
	}

	@And("the user enters the valid personal details")
	public void the_user_enters_the_valid_personal_details() {
		
		
		
		
		SignupPage signupPage = new SignupPage(driver);
		signupPage.selectTitle("Ms.");
	    signupPage.enterFirstName("Sindhu");
	    signupPage.enterLastName("Chirra");
	     signupPage.selectFemaleGender("F");
	     signupPage.enterDateofBirth("07/03/2000");
	     signupPage.enterSocialsecurityNumber("206-89-0309");
	     signupPage.enterEmailaddress(uuid +"@gmail.com");
	     signupPage.enterPassword("Sindhu.123");
	     signupPage.enterConfirmPassword("Sindhu.123");
	     signupPage.clickNextBtn();
	     signupPage.enterAddress("Hyderabad");
	     signupPage.enterLocality("Abcd");
	     signupPage.enterRegion("TS");
	     signupPage.enterPostalCode("506111");
	     signupPage.enterCountry("India");
	     signupPage.enterHomePhone("(123)456-789");
	     signupPage.enterMobilePhone("(976)654-240");
	     signupPage.enterWorkPhone("(459)412-489");
	     signupPage.clickTermsCheckbox();
	     }

	@And("he clicks on the register button")
	public void he_clicks_on_the_register_button() {
	}
		@Then("he should should verify- {string}")
		public void he_should_should_verify(String string) throws IOException {
		SignupPage signupPage = new SignupPage(driver);
		signupPage.clickRegisterBtn();
		String expectedErrMsg = "Registration Successful. Please Login.";
	    String actualErrMsg = signupPage.getSIGNINMsg();
	     Assert.assertEquals(actualErrMsg, expectedErrMsg);
		

	/*	
		try {

		    assertTrue(driver.getTitle().equals("Registration Successful. Please Login."));

		    logger.info("User Sees welcome message");

		} catch (AssertionError e) {

		    String screenshotPath = takeScreenshot();

		    Reporter.log( screenshotPath);

		    throw e;

		}*/


		}



	// Add a method to capture a screenshot

	public String takeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\hp\\Desktop\\ScreenshotForCucumber\\myscreenshot_" + System.currentTimeMillis() + ".png";
		File target = new File(path);
		FileUtils.copyFile(source, target);
		String targetPath = target.getAbsolutePath();
		return targetPath;

		

}

	}
		
	
