package StepDefinition;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Level;

import PageFactory.AgilsearchTRN;
import PageFactory.CheckingPage;
import PageFactory.ClickSavingAgilesh;
import PageFactory.ClickTransferBetweenAccount;
import PageFactory.CreateSavingsAccount;
import PageFactory.CreatingSavingsAccountPage;
import PageFactory.DepositMoney;
import PageFactory.LoginPage;
//import PageFactory.LoginPageAgilesh;
import PageFactory.SearchBox;
/*import PageFactory.SignIn;
import PageFactory.SignInPageBhargavi;
import PageFactory.SignInPageKamesh;
import PageFactory.SigninPage;*/
import PageFactory.Submit;
import PageFactory.TransferBetweenAccount;
import PageFactory.Transferamount;
import PageFactory.VISADirectTransfer;
import PageFactory.VerifyMessageForTransferBwAccount;
import PageFactory.VerifyWelcomeMessage;
import PageFactory.Visaaccountnumber;
import PageFactory.WithdrawFromAccount;
import PageFactory.logout;
import PageFactory.verifyerrormessage;


import java.util.UUID;

public class Driver extends Tools{
	
	//Shivam Code Part
	protected static LoginPage loginPage;
	protected static ClickTransferBetweenAccount clickTransferBetweenAccount;
	protected static TransferBetweenAccount transferBetweenAccount;
	protected static VerifyMessageForTransferBwAccount verifyMessageForTransferBwAccount;
	protected static VerifyWelcomeMessage verifyWelcomeMessage;
	
	//Meghna Code Part
	
	// protected static SigninPage signin; 
	    protected static CreateSavingsAccount saving;
	    protected static DepositMoney deposit;
	    
	    
	    //Bhargavi Code Part
	    
	    //protected static SignInPageBhargavi signinpageBhargavi;
		protected static CreatingSavingsAccountPage creatingsavingsaccountpage;
		protected static WithdrawFromAccount withdrawfromaccount;
		protected static logout Logout;
		
		
		//Kisan Code Part
		//protected static SignIn w;
		protected static VISADirectTransfer z;
		protected static Visaaccountnumber y;
		protected static  Transferamount transferPage;
		protected static Submit l;
		protected static verifyerrormessage k;
	
		
		//Kamesh Code Part
		//protected static SignInPageKamesh signInPageKamesh;
		protected static CheckingPage checkingPage;
		protected static SearchBox searchboxbutton;
		
		//Agilesh Code Part
	//	protected static LoginPageAgilesh loginPageAgilesh ;
		protected static ClickSavingAgilesh clicksavingAgilesh ;
		protected static  AgilsearchTRN agilsearchTRN ;
		
		
	public static  Logger logger ;
	
	public static void init() {
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		
		//Shivam Code
		loginPage = new LoginPage(driver);
		clickTransferBetweenAccount = new ClickTransferBetweenAccount(driver);
		transferBetweenAccount = new TransferBetweenAccount(driver);
		verifyMessageForTransferBwAccount = new VerifyMessageForTransferBwAccount(driver);
		verifyWelcomeMessage = new VerifyWelcomeMessage(driver);
		
		//Meghna Code Part
		//signin = new SigninPage(driver);
	   	 saving=new CreateSavingsAccount(driver);
	    deposit=new DepositMoney(driver);
		
	  //Bhargavi Code Part
	   // signinpageBhargavi = new SignInPageBhargavi(driver);
		creatingsavingsaccountpage = new CreatingSavingsAccountPage(driver);
		withdrawfromaccount = new WithdrawFromAccount(driver);
		Logout = new logout(driver);
		
		//Kisan Code Part
	//	w=new SignIn(driver);
		  z= new VISADirectTransfer(driver);
		  y= new Visaaccountnumber(driver);
		  transferPage = new Transferamount(driver);
		  l=new Submit(driver);
		  k=new verifyerrormessage(driver);
		 
		  //Kamesh Code Part
		 // signInPageKamesh = new SignInPageKamesh(driver);
			checkingPage = new CheckingPage(driver);
			searchboxbutton = new SearchBox(driver);
		  //Agilesh Code
		//	loginPageAgilesh = new LoginPageAgilesh(driver);
			clicksavingAgilesh= new ClickSavingAgilesh(driver);
			agilsearchTRN = new AgilsearchTRN(driver);
	    
	    
		UUID uuid = UUID.randomUUID();
		logger = Logger.getLogger("RRLProject");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		
		
	}
	
	
	
	
}
