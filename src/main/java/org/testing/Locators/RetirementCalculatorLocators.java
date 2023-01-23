package org.testing.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class RetirementCalculatorLocators {
	
	public RetirementCalculatorLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@Getter
	@FindBy(xpath="//a[@href='/']/img[1]")
	private WebElement logo;
	
	@Getter
	@FindBy(xpath = "//input[@id='current-age']")
	private WebElement currentAgeTextBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='retirement-age']")
	private WebElement retirementAgeTextBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='current-income']")
	private WebElement currentIncomeTextBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='spouse-income']")
	private WebElement spouseIncome;
	
	@Getter
	@FindBy(xpath = "//input[@id='current-total-savings']")
	private WebElement cToSavingTxtBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='current-annual-savings']")
	private WebElement currentlySavingTxtBox;

	@Getter
	@FindBy(xpath = "//input[@id='savings-increase-rate']")
	private WebElement increaseSavingRateTxtBox;
	
	@Getter
	@FindBy(xpath = "//body/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[2]/section[1]/form[1]/div[3]/div[1]/div[1]/fieldset[1]/ul[1]/li[1]/label[1]")
	private WebElement socialSecurityYesButton;
	
	@Getter
	@FindBy(xpath = "//label[contains(text(),'Married')]")
	private WebElement maritalStatus;

	@Getter
	@FindBy(xpath = "//input[@id='social-security-override']")
	private WebElement socialSecurityOverrideTxtBox;

	@Getter
	@FindBy(xpath = "//a[contains(text(),'Adjust default values')]")
	private WebElement adjustDefaultValue;

	@Getter
	@FindBy(xpath = "//input[@id='additional-income']")
	private WebElement otherIncomeTxtBox;

	@Getter
	@FindBy(xpath = "//input[@id='retirement-duration']")
	private WebElement retirementDurationTextBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='include-inflation' and @value='Y']")
	private WebElement postRetirementInflationButton;
	
	@Getter
	@FindBy(css = "#retirement-annual-income")
	private WebElement retirmentIncomeAnnual;
	
	@Getter
	@FindBy(xpath = "//input[@id='pre-retirement-roi']")
	private WebElement preretirmentInvestmentReturnTxtBox;
	
	@Getter
	@FindBy(xpath = "//input[@id='post-retirement-roi']")
	private WebElement postRetirmentInvestmentReturnTxtBox;
	
	@Getter
	@FindBy(xpath = "//button[contains(text(),'Save changes')]")
	private WebElement saveChangesButton;
	
	@Getter
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement cancelButton;
	
	@Getter
	@FindBy(xpath = "//button[contains(text(),'Calculate')]")
	private WebElement calculateButton;
	
	@Getter
	@FindBy(xpath = "//input[@id='no-social-benefits']")
	private WebElement socialSecurityNoButton;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement b;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement c;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement d;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement e;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement f;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement g;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement h;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement j;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement k;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement l;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement n;
	
	@Getter
	@FindBy(xpath = "")
	private WebElement m;
}
