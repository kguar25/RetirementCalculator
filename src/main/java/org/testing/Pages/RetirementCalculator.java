package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public boolean validateAdjustDefaultValue() {
		WebElement adjustDefault=rc.getAdjustDefaultValue();
		adjustDefault.click();
		delay();
		return false;
	}
	
	public boolean validateOtherIncomeTxtBox() {
		WebElement oIncome= rc.getOtherIncomeTxtBox();
		oIncome.click();
		return inputValue(oIncome, "500"); 
	}
	
	public boolean validateRetirementDurationTextBox() {
		WebElement retirementDuration= rc.getRetirementDurationTextBox();
		retirementDuration.click();
		return inputValue(retirementDuration, "20"); 
	}
	
	public boolean validatePostRetirementInflationButton() {
		WebElement postInfationYes= rc.getPostRetirementInflationButton();
		Actions actions = new Actions(driver); 
		actions.moveToElement(postInfationYes).click().build().perform();
		delay();
		return false;
	}
	
	public boolean validateRetirmentIncomeAnnual() {
		WebElement raincome= rc.getRetirmentIncomeAnnual();
		raincome.click();
		return inputValue(raincome, "75"); 
	}

	public boolean validatePreretirmentInvestmentReturnTxtBox() {
		WebElement preRetirement= rc.getPreretirmentInvestmentReturnTxtBox();
		preRetirement.click();
		return inputValue(preRetirement, "8"); 
	}
	
	public boolean validatePostRetirmentInvestmentReturnTxtBox() {
		WebElement postRetirement= rc.getPostRetirmentInvestmentReturnTxtBox();
		postRetirement.click();
		return inputValue(postRetirement, "5"); 
	}
	
	public boolean validateSaveChangesButton() {
		WebElement saveChanges=rc.getSaveChangesButton();
		saveChanges.click();
		delay();
		return false;
	}

}
