package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BCD_Kamesh_Search_TRN_ViewCheckingAccount extends Driver {
	
	
	@Given("the User is on the login page")
	public void the_user_is_on_the_login_page() {
		
		
	}

	@When("the User enter the username and password")
	public void the_user_enter_the_username_and_password(){
		
		loginPage.ClickUsername();
        loginPage.ClickPassword();
        loginPage.ClickSubmit();
        
		/*signInPageKamesh.enterUsername("kamesh@gmail.com");
		signInPageKamesh.enterPassword("2424Kamesh");
		signInPageKamesh.clickSIgnInBtn()*/

	}

	@When("the User click on Checking and View Checking")
	public void the_user_click_on_checking_and_view_checking() {
		
		 checkingPage.navigateToChecking(); 
		 logger.info("Clicked on View Checking");

	}

	@Then("the User should enter the {string} on the search box")
	public void the_user_should_enter_the_on_the_search_box(String string) {
		try {
			searchboxbutton.searchboxButton1("845549182");
		} catch (Exception e) {
			loginPage.ClickUsername();
	        loginPage.ClickPassword();
	        loginPage.ClickSubmit();
			searchboxbutton.searchboxButton1("845549182");
		}
		
			
		
		//driver.quit();	

		
	}
	
}
		

		


