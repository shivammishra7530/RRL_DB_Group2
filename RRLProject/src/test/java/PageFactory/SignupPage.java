package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	@FindBy(linkText="Sign Up Here")
	private WebElement SignUpHere;
	
	@FindBy (id="title")
	private WebElement titleDropdown;
	
	@FindBy(id ="firstName")
	private WebElement FirstName;
	
	@FindBy(id ="lastName")
	private WebElement LastName;
	
	@FindBy(xpath="//input[contains(@value,'F')]")
	private WebElement fGenderRadioElement;
	
	@FindBy(id="dob")
	private WebElement DOB;
	
	@FindBy(id="ssn")
	private WebElement SSN; 
	
	@FindBy(id="emailAddress")
	private WebElement EmailAddress; 
	
	@FindBy(id="password")
	private WebElement PASSWORD;
	
	@FindBy(id="confirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy (xpath="//button[contains(@class,'btn btn-primary btn-flat m-b-30 m-t-30')]")
	private WebElement NextBtn;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="locality")
	private WebElement Locality;
	
	@FindBy(id="region")
	private WebElement Region;
	
	@FindBy(id="postalCode")
	private WebElement PostalCode;
	
	@FindBy(id="country")
	private WebElement Country;
	
	@FindBy(id="homePhone")
	private WebElement HomePhone;
	
	@FindBy(id="mobilePhone")
	private WebElement MobilePhone;
	
	@FindBy(id="workPhone")
	private WebElement WorkPhone;
	
	@FindBy(id="agree-terms")
	private WebElement checkboxElement;
	
	@FindBy (xpath="//button[contains(@class,'btn btn-primary btn-flat m-b-30 m-t-30')]")
	private WebElement RegisterBtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/span[2]")
	private WebElement SIGNIN;
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickSigUpHere() {
		SignUpHere.click();
		}
	public String selectTitle(String option) {
		Select dropdown = new Select(titleDropdown);
		dropdown.selectByVisibleText(option);
		return dropdown.getFirstSelectedOption().getText();	
	}
	public void enterFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		LastName.sendKeys(lastName);
    }
	
	 public void selectFemaleGender(String string) {
		 fGenderRadioElement.click();
	 }
	 public void enterDateofBirth(String dob) {
			DOB.sendKeys(dob);
	 }
	 public void enterSocialsecurityNumber(String ssn) {
		 SSN.sendKeys(ssn);
	 }
	 public void enterEmailaddress(String emailAddress) {
		 EmailAddress.sendKeys(emailAddress);
	 }
	 public void enterPassword(String password) {
		 PASSWORD.sendKeys(password);
	 }
	 public void enterConfirmPassword(String confirmPassword) {
		 ConfirmPassword.sendKeys(confirmPassword);
	 }
	 public void clickNextBtn() {
			NextBtn.click();
	 }
	 public void enterAddress(String address) {
		 Address.sendKeys(address);
	 }
	 public void enterLocality(String locality) {
		 Locality.sendKeys(locality);
	 }
	 public void enterRegion(String region) {
		 Region.sendKeys(region);
	 }
	 public void enterPostalCode(String postalcode) {
		 PostalCode.sendKeys(postalcode);
	 }
	 public void enterCountry(String country) {
		 Country.sendKeys(country);
	 }
	 public void enterHomePhone(String homephone) {
		 HomePhone.sendKeys(homephone);
	 }
	 public void enterMobilePhone(String mobilephone) {
		 MobilePhone.sendKeys(mobilephone);
	 }
	 public void enterWorkPhone(String workphone) {
		 WorkPhone.sendKeys(workphone);
	 }
	 public void clickTermsCheckbox() {
		 if (!checkboxElement.isSelected()) {
	            checkboxElement.click(); 
	            }}
     public void clickRegisterBtn() {
				RegisterBtn.click();
	}
     public String getSIGNINMsg() {
    	 String Message = SIGNIN.getText();
    	 return Message;
     }
}
