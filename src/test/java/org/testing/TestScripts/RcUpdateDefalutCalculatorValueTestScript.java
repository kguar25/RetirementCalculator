package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.RetirementCalculator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.testing.Listeners.Listeners.class)
public class RcUpdateDefalutCalculatorValueTestScript extends Base{

	RcUpdateDefalutCalculatorValueTestScript rcdct;
	RetirementCalculator rc;
	
	@Test(priority = 0, groups = { "Functional", "smoke" })
	public void validateSecurianLogoIsDisplayed() throws InterruptedException {
		rc = new RetirementCalculator(driver, pr);
		boolean securianLogo = rc.validateSecurianLogoIsDisplayed();
		Assert.assertTrue(securianLogo, "Securian Financial logo is not displayed");
		if (securianLogo == true) {
			System.out.println("Securian Financial logo is displayed");
		}
	}

	@Test(priority = 1, groups = { "Functional", "smoke" })
	public void validateCurrentAgeInputBoxIsDisplayed() throws InterruptedException {
		boolean currentAge = rc.validateCurrentAgeInputBoxIsDisplayed();
		Assert.assertTrue(currentAge, "Current Age text box is not displayed");
		if (currentAge == true) {
			System.out.println("Current Age text box is displayed");
		}
	}

	@Test(priority = 2, groups = { "Functional", "smoke" })
	public void validateCurrentAge() {
		boolean age = rc.validateCurrentAge();
		Assert.assertTrue(age, "User current age is not entered");
		if (age == true) {
			System.out.println("User current age is successfully entered");
		}
	}

	@Test(priority = 3, groups = { "Functional", "smoke" })
	public void validateRetirementAge() {
		boolean RetiremAge = rc.validateRetirementAge();
		Assert.assertTrue(RetiremAge, "User retirement age is not entered");
		if (RetiremAge == true) {
			System.out.println("User retirement age is successfully entered");
		}
	}

	@Test(priority = 4, groups = { "Functional", "smoke" })
	public void validateCurrentIncome() {
		boolean currentIncome = rc.validateCurrentIncome();
		Assert.assertTrue(currentIncome, "User current annual income is not entered");
		if (currentIncome == true) {
			System.out.println("User current annual income is successfully entered");
		}
	}

	@Test(priority = 5, groups = { "Functional", "smoke" })
	public void validateSpouseIncome() {
		boolean spouseIncome = rc.validateSpouseIncome();
		Assert.assertTrue(spouseIncome, "Spouse income is not entered");
		if (spouseIncome == true) {
			System.out.println("Spouse income is successfully entered");
		}
	}

	@Test(priority = 6, groups = { "Functional", "smoke" })
	public void validateCToSavingTxtBox() {
		boolean currentSaving = rc.validateCToSavingTxtBox();
		Assert.assertTrue(currentSaving, "Current retirement saving is not entered");
		if (currentSaving == true) {
			System.out.println("Current retirement saving is successfully entered");
		}
	}

	@Test(priority = 7, groups = { "Functional", "smoke" })
	public void validateCurrentlySavingTxtBox() {
		boolean currentlySaving = rc.validateCurrentlySavingTxtBox();
		Assert.assertTrue(currentlySaving, "Currently annual retirement saving is not entered");
		if (currentlySaving == true) {
			System.out.println("Currently annual retirement saving is successfully entered");
		}
	}

	@Test(priority = 8, groups = { "Functional", "smoke" })
	public void validateIncreaseSavingRateTxtBox() {
		boolean increaseSavingRate = rc.validateIncreaseSavingRateTxtBox();
		Assert.assertTrue(increaseSavingRate, "Increase saving rate is not entered");
		if (increaseSavingRate == true) {
			System.out.println("Increase saving rate is successfully entered");
		}
	}

	@Test(priority = 9, groups = { "Functional", "smoke" })
	public void validateSocialSecurityYesButtonIsEnabled() {
		rc = new RetirementCalculator(driver, pr);
		boolean socialSecurityYes = rc.validateSocialSecurityYesButtonIsEnabled();
		boolean socialSecurityButton = rc.validateSocialSecurityYesButton();

		Assert.assertTrue(socialSecurityYes, "Social security yes button found enabled");
		if (socialSecurityYes == false) {
			System.out.println("Social security yes button not enabled");
			delay();
		}
		if (socialSecurityButton == false) {
			softAssert.assertFalse(socialSecurityButton, "Social security yes button found clickable");
			System.out.println("Social security yes button not clickable");
			softAssert.assertAll();
		}
	}

	@Test(priority = 10, groups = { "Functional", "smoke" })
	public void validateMaritalStatusIsEnabled() {
		boolean maritalStatusYes = rc.validateMaritalStatusIsEnabled();
		boolean maritalStatus = rc.validateMaritalStatus();

		Assert.assertFalse(maritalStatusYes, "Social security yes button found enabled");
		if (maritalStatusYes == false) {
			System.out.println("Social security yes button not enabled");
			delay();
		}
		if (maritalStatus == false) {
			softAssert.assertFalse(maritalStatus, "Social security yes button found clickable");
			System.out.println("Social security yes button not clickable");
			softAssert.assertAll();
		}
	}

	@Test(priority = 11, groups = { "Functional", "smoke" })
	public void validateSocialSecurityOverrideTxtBox() {
		boolean sSecurityOverride = rc.validateSocialSecurityOverrideTxtBox();
		Assert.assertTrue(sSecurityOverride, "social security override is not entered");
		if (sSecurityOverride == true) {
			System.out.println("social security override is successfully entered");
		}
	}
	
	@Test(priority = 14, groups= {"Functional","smoke"})
	public void validateAdjustDefaultValue() {
		boolean adjustDefault = rc.validateAdjustDefaultValue();
		if (adjustDefault == false) {
			softAssert.assertFalse(adjustDefault, "adjustDefault Clickable");
			System.out.println("adjustDefault is not Clickable");
			softAssert.assertAll();
		}
	}
	
	@Test(priority = 15, groups = { "Functional", "smoke" })
	public void validateOtherIncomeTxtBox() {
		boolean otherIncome = rc.validateOtherIncomeTxtBox();
		Assert.assertTrue(otherIncome, "Other income is not entered");
		if (otherIncome == true) {
			System.out.println("Other income is successfully entered");
		}
	}
	
	@Test(priority = 16, groups = { "Functional", "smoke" })
	public void validateRetirementDurationTextBox() {
		boolean retirementDuration = rc.validateRetirementDurationTextBox();
		Assert.assertTrue(retirementDuration, "Retirement duration is not entered");
		if (retirementDuration == true) {
			System.out.println("Retirement duration is successfully entered");
		}
	}
	
	@Test(priority = 17, groups = { "Functional", "smoke" })
	public void validatePostRetirementInflationButton() {
		boolean postInflation = rc.validatePostRetirementInflationButton();
		if (postInflation == false) {
		softAssert.assertFalse(postInflation, "postInflation is not selected successfully");
		System.out.println("postInflation selected successfully");
		softAssert.assertAll();
		}
	}
	
	@Test(priority = 18, groups = { "Functional", "smoke" })
	public void validateRetirmentIncomeAnnual() {
		boolean rAnnualIncome = rc.validateRetirmentIncomeAnnual();
		Assert.assertTrue(rAnnualIncome, "Retirement annual income is not entered");
		if (rAnnualIncome == true) {
			System.out.println("Retirement annual income is successfully entered");
		}
	}
	
	@Test(priority = 19, groups = { "Functional", "smoke" })
	public void validatePreretirmentInvestmentReturnTxtBox() {
		boolean preInvest = rc.validatePreretirmentInvestmentReturnTxtBox();
		Assert.assertTrue(preInvest, "Pre retirement investment is not entered");
		if (preInvest == true) {
			System.out.println("Pre retirement investment is successfully entered");
		}
	}
	
	@Test(priority = 20, groups = { "Functional", "smoke" })
	public void validatePostRetirmentInvestmentReturnTxtBox() {
		boolean postInvest = rc.validatePostRetirmentInvestmentReturnTxtBox();
		Assert.assertTrue(postInvest, "Post retirement investment is not entered");
		if (postInvest == true) {
			System.out.println("Post retirement investment is successfully entered");
		}
	}
	
	@Test(priority = 21, groups = { "Functional", "smoke" })
	public void validateSaveChangesButton() {
		boolean saveButton = rc.validateSaveChangesButton();
		if (saveButton == false) {
			softAssert.assertFalse(saveButton, "Save changes button found Clickable");
			System.out.println("Save changes button is not Clickable");
			softAssert.assertAll();
		}
	}


	@Test(priority = 22, groups = { "Functional", "smoke" })
	public void validateCalculateButton() {
		boolean calculate = rc.validateCalculateButton();
		if (calculate == false) {
			softAssert.assertFalse(calculate, "Calculate button found Clickable");
			System.out.println("Calculate button is not Clickable");
			softAssert.assertAll();
		}
	}

	@Test(priority = 13, groups = { "Functional", "smoke" })
	public void validatePageTitleTest() throws InterruptedException {
		String expTitle = "How Much to Save for Retirement | Securian Financial";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "If unequal found print : Page title not verified");
	}
}
