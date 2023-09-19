package StepDefinition;


import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BBB_Bhargavi_WithdrawMoney extends Driver{
	
	
	@Given("the User is on the home page")
	public void the_user_is_on_the_home_page() throws InterruptedException {
		loginPage.ClickUsername();
        loginPage.ClickPassword();
        loginPage.ClickSubmit();
		
		/*signinpageBhargavi.enterUsername("abc123456@gmail.com");
		signinpageBhargavi.enterPassword("Bhargavi@01");
		signinpageBhargavi.clickSIgnInBtn();*/
	Thread.sleep(3000);
	 logger.info("User successfully logins to Application");
		
	   
	}

	
	@When("the User clicks on savings  and create account")
	public void the_user_clicks_on_savings_and_creat_account() throws InterruptedException {
		Thread.sleep(3000);
		/*creatingsavingsaccountpage.Savings();
		creatingsavingsaccountpage.NewSavingsAccount();
		creatingsavingsaccountpage.savingsAccountType();
		creatingsavingsaccountpage.Accountownership();
		creatingsavingsaccountpage.enterAccountname("John");
		creatingsavingsaccountpage.enterInitialdeposit("13500");
		creatingsavingsaccountpage.submitbtn();*/
		 logger.info("User successfully created Savings Account");
		
	  
	}
	
	@When("the User verify-{string}")
	public void the_user_verify(String string) {
		/* String expectedMsg = string;
		    String actualMsg = creatingsavingsaccountpage.getMsg();
		    Assert.assertEquals(actualMsg, expectedMsg);
		    logger.info("User verifies -Successfully created new Savings account named John");*/
	}

	@When("the User clicks on withdraw and withdrawls the money")
	public void the_user_clicks_on_withdraw_and_withdrawls_the_money() throws InterruptedException {
		withdrawfromaccount.clickWithdraw();
		try {
			withdrawfromaccount.clickWithdraw();
			withdrawfromaccount.clickselectedAccount();
			withdrawfromaccount.enterWithdrawalamount("25");
			withdrawfromaccount.clicksubmit();
			 logger.info("User Withdrawls Money from savings account");	
		} catch (Exception e) {
			loginPage.ClickUsername();
	        loginPage.ClickPassword();
	        loginPage.ClickSubmit();
	        withdrawfromaccount.clickWithdraw();
			withdrawfromaccount.clickselectedAccount();
			withdrawfromaccount.enterWithdrawalamount("25");
			withdrawfromaccount.clicksubmit();
			 logger.info("User Withdrawls Money from savings account");
		}
		
		
		
	    
	}

	@Then("the User should Verify-{string}")
	public void the_user_should_verify(String string) {
		 String expectedMsg = string;
		    String actualMsg = withdrawfromaccount.VerifyAccountMsg();
		    Assert.assertEquals(actualMsg, expectedMsg);
		    logger.info("User Verified Account Number");
	   
	}

}