package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testing.Base.Base;
import org.testing.Locators.RetirementCalculatorLocators;


public class RetirementCalculator extends Base{
	
	RetirementCalculatorLocators rc;
	
	WebDriver driver;
	Properties pr;
	
	public RetirementCalculator(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
		rc = new RetirementCalculatorLocators(driver);
	}
	
	public boolean validateSecurianLogoIsDisplayed() throws InterruptedException{
		WebElement securianLogo = rc.getLogo();
		return isElementVisible(securianLogo);
	}
	
	public boolean validateCurrentAgeInputBoxIsDisplayed() throws InterruptedException{
		WebElement txtBox = rc.getCurrentAgeTextBox();
		return isElementVisible(txtBox);
	}
	
	public boolean validateCurrentAge() {
		WebElement currentAge= rc.getCurrentAgeTextBox();
		return inputValue(currentAge, "40");
	}
	
	public boolean validateRetirementAge() {
		WebElement retirementAge= rc.getRetirementAgeTextBox();
		return inputValue(retirementAge, "68");
	}
	
	public boolean validateCurrentIncome() {
		WebElement currentIncomeTax= rc.getCurrentIncomeTextBox();
		currentIncomeTax.click();
		return inputValue(currentIncomeTax, "100000");
	}
	
	public boolean validateSpouseIncome() {
		WebElement spouseIncome= rc.getSpouseIncome();
		spouseIncome.click();
		return inputValue(spouseIncome, "75000");
	}
	
	public boolean validateCToSavingTxtBox() {
		WebElement currentTotalSaving= rc.getCToSavingTxtBox();
		currentTotalSaving.click();
		return inputValue(currentTotalSaving, "500000");
	}
	
	public boolean validateCurrentlySavingTxtBox() {
		WebElement currentlyTotalSaving= rc.getCurrentlySavingTxtBox();
		return inputValue(currentlyTotalSaving, "10");
	}
	
	public boolean validateIncreaseSavingRateTxtBox() {
		WebElement increaseSavingRate= rc.getIncreaseSavingRateTxtBox();
		return inputValue(increaseSavingRate, "2");
	}
	
	public boolean validateSocialSecurityYesButton() {
		WebElement socialSecurityYes= rc.getSocialSecurityYesButton();
		Actions actions = new Actions(driver); 
		actions.moveToElement(socialSecurityYes).click().build().perform();
		delay();
		return false;
	}
	
	public boolean validateSocialSecurityYesButtonIsEnabled() {
		WebElement socialSecurityYes= rc.getIncreaseSavingRateTxtBox();
		return socialSecurityYes.isEnabled();
	}
	
	public boolean validateMaritalStatusIsEnabled() {
		WebElement maritalStatus= rc.getMaritalStatus();
		maritalStatus.click();
		delay();
		return false;
	}
	
	public boolean validateMaritalStatus() {
		WebElement maritalStatus= rc.getMaritalStatus();
		return maritalStatus.isEnabled(); 
	}
	
	public boolean validateSocialSecurityOverrideTxtBox() {
		WebElement sSecurityOverride= rc.getSocialSecurityOverrideTxtBox();
		return inputValue(sSecurityOverride, "4000"); 
	}
	
	public boolean validateCalculateButton() {
		WebElement calculateButton=rc.getCalculateButton();
		calculateButton.click();
		delay();
		return false;
	}

}
