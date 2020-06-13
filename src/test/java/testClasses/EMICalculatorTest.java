package testClasses;

import java.util.Hashtable;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClasses.baseTestClass;
import pageClasses.LandingPage;
//import pageClasses.ProductPage;
import utilities.TestDataProvider;

public class EMICalculatorTest extends baseTestClass {
	LandingPage landingPage;
	//ProductPage productPage;
	
	@Test(dataProvider="EMICalculatorTestData",description="executes the complete test")
	public void emicalculator(Hashtable<String, String> testData) {
		logger = report.createTest("EMI_Calculator Test");
		
		invokeBrowser("chrome");
		landingPage = openApplication(testData.get("WebPageURL"));
		landingPage.clickCarLoanButton();
		
		String CarLoanAmount = testData.get("CarLoanAmount");
		//System.out.println(CarLoanAmount);
		landingPage.enterLoanAmount(CarLoanAmount);
		
		String InterestRate = testData.get("InterestRate");
		//System.out.println(InterestRate);
		landingPage.enterLoanInterestRate(InterestRate);
		
		String LoanTenure = testData.get("LoanTenure");
		//System.out.println(LoanTenure);
		landingPage.enterLoanTerm(LoanTenure);
		
		landingPage.clickEMIInArrears();
		landingPage.clickReadMore();
		landingPage.fetchTestResult();
		landingPage.writeData();
	}
	
	@DataProvider
	public Object[][] EMICalculatorTestData(){
		return TestDataProvider.getTestData("EMICalculatorTestData.xlsx", "LoanDetails", "emiCalculator");
	}
}
