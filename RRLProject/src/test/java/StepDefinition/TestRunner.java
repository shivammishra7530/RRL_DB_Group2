package StepDefinition;



import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		/*features = { "Features//user.registration1.feature", "Features//login.feature", "Features//deposit_money_to_account.feature", 
				"Features//withdraw_money_from_account.feature", "Features//TransferMoneyBwAccounts.feature", "Features//bank.feature" ,
				 "Features//AgileshFeatureFile.feature", "Features//search_trn_no_checkingpage.feature" },	*/
		
		 features = "Features//All_In_One.feature",   
		
		
		//features = "Features//user.registration1.feature",                  //Sindhu
		
		//features = "Features//login.feature",                               //Ragu
		
		//features = "Features//deposit_money_to_account.feature",            //Meghna
		
		//features = "Features//withdraw_money_from_account.feature",         //Bhargavi
		
	    // features = "Features//TransferMoneyBwAccounts.feature",             //Shivam      
	
	    //features = "Features//bank.feature",                                 //Kisan
		
        //features = "Features//search_trn_no_checkingpage.feature",           //Kamesh
		
	    //features = "Features//AgileshFeatureFile.feature",                //Agilesh
		 
		
			      glue = "StepDefinition"
			
		
		
		)

@Listeners(Utilities.TestListener.class)

public class TestRunner extends AbstractTestNGCucumberTests{

}
