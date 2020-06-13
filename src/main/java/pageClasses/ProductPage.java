package pageClasses;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;

import baseClasses.pageBaseClass;
import utilities.WriteResultsToExcel;

public class ProductPage extends pageBaseClass {
	
	ProductPage(WebDriver driver, ExtentTest logger) {
		super();
	}

	@FindBy(xpath="//*[@id=\"leschemewrapper\"]/div/div/div/div/label[2]")
	WebElement EMIInArrears;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement readMore;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement principalAmount;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[3]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement interestAmount;
	
	
	public void clickEMIInArrears() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		EMIInArrears.click();
	}
	


	public void clickReadMore() {
		Actions action = new Actions(driver);
		action.contextClick(readMore).perform();
		System.out.println("Entering into clickReadMore function: ");
		readMore.click();
	}

	public static String principalAmountMonth1;
	public static String interestAmountMonth1;

	public void fetchTestResult() {
		principalAmountMonth1 = principalAmount.getText();
		System.out.println(principalAmountMonth1);
		
		interestAmountMonth1 = interestAmount.getText();
		System.out.println(interestAmountMonth1);
	}

	String name = WriteResultsToExcel.writeData(principalAmountMonth1, interestAmountMonth1);
	//logger.log(Status.INFO, "Data written in excel sheet- " +name);
}*/
