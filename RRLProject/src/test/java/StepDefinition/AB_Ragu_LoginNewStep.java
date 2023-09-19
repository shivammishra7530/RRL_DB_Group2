package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import PageFactory.LoginTestPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ReadExcel;

public class AB_Ragu_LoginNewStep extends Driver{
	
	//WebDriver driver;
    LoginTestPage loginPage;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		
       
		/*driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dbankdemo.com/bank/login");*/
        loginPage = new LoginTestPage(driver);

	}

	@When("I enter username and password")
	public void i_enter_username_and_password() throws IOException, InterruptedException {
		String[][] data = ReadExcel.getData("Resource//TestData.xlsx", "Sheet1");

		for(int i = 1; i < 6; i++)
		{
			String username = data[i][0];
			String password = data[i][1];
		loginPage.enterDetails(username, password);
		
        try {
        	
    		String expectedMessage = "Dashboard"   ;     	 
            String actualMessage = loginPage.getDashboardText();
            Assert.assertEquals(expectedMessage, actualMessage);
        } catch (NoSuchElementException e) {
            Thread.sleep(2000); 
            String actualMessage = loginPage.getErrorMsg();
            Assert.assertTrue(actualMessage.contains("Invalid credentials") || actualMessage.contains("access not granted"));
        }
        
		}
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		logger.info("Login With Invalid Data");
	}

	@Then("I get logged in successfully")
	public void i_get_logged_in_successfully() {
		logger.info("Login is Successfully");
	}


}
