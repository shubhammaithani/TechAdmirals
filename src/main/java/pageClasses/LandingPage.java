package pageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.pageBaseClass;
import utilities.WriteResultsToExcel;

public class LandingPage extends pageBaseClass {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//*[@id=\"car-loan\"]/a")
	WebElement carLoan;

	@FindBy(xpath = "//input[@id='loanamount']")
	WebElement loanAmount;

	@FindBy(xpath = "//input[@id='loaninterest']")
	WebElement loanInterest;

	@FindBy(xpath = "//input[@id='loanterm']")
	WebElement loanTerm;

	@FindBy(xpath="//*[@id=\"leschemewrapper\"]/div/div/div/div/label[2]")
	WebElement EMIInArrears;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement readMore;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement principalAmount;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement interestAmount;
	
	public void clickCarLoanButton() {
		carLoan.click();
		logger.log(Status.INFO, "Car Loan Option Selected succesfully");
	}

	public void enterLoanAmount(String Amount) {
		loanAmount.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		loanAmount.sendKeys(Keys.BACK_SPACE);
		loanAmount.sendKeys(Amount);
		
		logger.log(Status.INFO, "Loan amount entered into the input box succesfully.");
	}

	public void enterLoanInterestRate(String interestRate) {

		loanInterest.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		loanInterest.sendKeys(Keys.BACK_SPACE);
		loanInterest.sendKeys(interestRate);
		
		logger.log(Status.INFO, "Loan interest rate entered into the input box succesfully.");

	}

	public void enterLoanTerm(String loanPeriod) {

		loanTerm.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		loanTerm.sendKeys(Keys.BACK_SPACE);
		loanTerm.sendKeys(loanPeriod);
		logger.log(Status.INFO, "Loan Tenure(in Years) entered into the input box succesfully.");
	}

	
	
	public void clickEMIInArrears() {
		EMIInArrears.click();
		logger.log(Status.INFO, "EMI in Arrears Option selected succesfully.");
	}
	


	public void clickReadMore() {
		readMore.click();
		logger.log(Status.INFO, "ALl details of 2020 displayed succesfully.");
	}

	public static String principalAmountMonth1;
	public static String interestAmountMonth1;

	public void fetchTestResult() {
		principalAmountMonth1 = principalAmount.getText();
		interestAmountMonth1 = interestAmount.getText();
	}

	public void writeData() {
		String name = WriteResultsToExcel.writeData(principalAmountMonth1, interestAmountMonth1);
		logger.log(Status.INFO, "Data written in excel sheet- "+name);
	}
	
}

