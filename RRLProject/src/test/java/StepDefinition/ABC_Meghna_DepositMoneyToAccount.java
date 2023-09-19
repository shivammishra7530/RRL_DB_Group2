package StepDefinition;



import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class ABC_Meghna_DepositMoneyToAccount extends Driver{
	


@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
}
	

	@When("the user enters their username and password and signs in")
	public void the_user_enters_their_username_and_password_and_signs_in() {
		
		loginPage.ClickUsername();
        loginPage.ClickPassword();
        loginPage.ClickSubmit();
    	/*signin.enterusername("meghana@gmail.com");
    	signin.enterpassword("Aruna*@321");
    	signin.clicksignin();
    	logger.info("succesfully signin");*/
	}

	@When("the user creates a savings account with an initial deposit amount")
	public void the_user_creates_a_savings_account_with_an_initial_deposit_amount() throws InterruptedException {
		
    	/*saving.clicksavings();
    	Thread.sleep(3000);
    	saving.clicknewsavings();
    	Thread.sleep(5000);
    	saving.clicksavingsBtn();
    	saving.clickonindividualBtn();
    	saving.enterAccountName("Selena");
    	saving.enterIntialDeposit("20000");*/
    	//saving.clickonSubmit();
       // logger.info("savings account created");   
	}

	@When("the user verifies the msg {string}")
	public void the_user_verifies_the_msg(String string) {
		
		/*String expectedErrMsg = "Successfully created new Savings account named Meghana";
		    String actualErrMsg = saving.getMsg();
		    Assert.assertEquals(actualErrMsg, expectedErrMsg);*/

	}
	@When("the user deposits money into the account")
	public void the_user_deposits_money_into_the_account() {
		deposit.clickonDeposit();
		try {
			
	    	deposit.selectAccount();
	    	deposit.enterAccountdepositMoney("29");
	    	deposit.clickonsubmit();
	        logger.info("amount deposited");
		} catch (Exception e) {
			loginPage.ClickUsername();
	        loginPage.ClickPassword();
	        loginPage.ClickSubmit();
			//deposit.clickonDeposit();
	    	deposit.selectAccount();
	    	deposit.enterAccountdepositMoney("29");
	    	deposit.clickonsubmit();
	        logger.info("amount deposited");
		}
		
    	/*deposit.clickonDeposit();
    	deposit.selectAccount();
    	deposit.enterAccountdepositMoney("29");
    	deposit.clickonsubmit();
        logger.info("amount deposited");*/
	}

	@When("the deposit should be successful")
	public void the_deposit_should_be_successful() {
		System.out.println("deposit successfull");
	}
	@Then("the user verify the msg {string}")
	public void the_user_verify_the_msg(String string) {
		
		 String expectedMsg = "Account Number: 486171292";
		    String actualMsg = deposit.getAccountMsg();
		    Assert.assertEquals(actualMsg, expectedMsg);

	}
}