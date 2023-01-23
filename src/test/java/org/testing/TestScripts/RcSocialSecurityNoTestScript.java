package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.RetirementCalculator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.testing.Listeners.Listeners.class)
public class RcSocialSecurityNoTestScript extends Base {

	RetirementCalculator rc;

	@Test(priority = 1, groups = { "Functional", "smoke" })
	public void validateCurrentAge() {
		rc =new RetirementCalculator(driver, pr);
		boolean age = rc.validateCurrentAge();
		Assert.assertTrue(age, "User current age is not entered");
		if (age == true) {
			System.out.println("User current age is successfully entered");
		}
	}

	@Test(priority = 2, groups = { "Functional", "smoke" })
	public void validateRetirementAge() {
		boolean RetiremAge = rc.validateRetirementAge();
		Assert.assertTrue(RetiremAge, "User retirement age is not entered");
		if (RetiremAge == true) {
			System.out.println("User retirement age is successfully entered");
		}
	}

	@Test(priority = 3, groups = { "Functional", "smoke" })
	public void validateCurrentIncome() {
		boolean currentIncome = rc.validateCurrentIncome();
		Assert.assertTrue(currentIncome, "User current annual income is not entered");
		if (currentIncome == true) {
			System.out.println("User current annual income is successfully entered");
		}
	}

	@Test(priority = 4, groups = { "Functional", "smoke" })
	public void validateCToSavingTxtBox() {
		boolean currentSaving = rc.validateCToSavingTxtBox();
		Assert.assertTrue(currentSaving, "Current retirement saving is not entered");
		if (currentSaving == true) {
			System.out.println("Current retirement saving is successfully entered");
		}
	}

	@Test(priority = 5, groups = { "Functional", "smoke" })
	public void validateCurrentlySavingTxtBox() {
		boolean currentlySaving = rc.validateCurrentlySavingTxtBox();
		Assert.assertTrue(currentlySaving, "Currently annual retirement saving is not entered");
		if (currentlySaving == true) {
			System.out.println("Currently annual retirement saving is successfully entered");
		}
	}

	@Test(priority = 6, groups = { "Functional", "smoke" })
	public void validateIncreaseSavingRateTxtBox() {
		boolean increaseSavingRate = rc.validateIncreaseSavingRateTxtBox();
		Assert.assertTrue(increaseSavingRate, "Increase saving rate is not entered");
		if (increaseSavingRate == true) {
			System.out.println("Increase saving rate is successfully entered");
		}
	}

	@Test(priority = 7, groups = { "Functional", "smoke" })
	public void validateCalculateButton() {
		boolean calculate = rc.validateCalculateButton();
		if (calculate == false) {
			softAssert.assertFalse(calculate, "Calculate button found Clickable");
			System.out.println("Calculate button is not Clickable");
			softAssert.assertAll();
		}
	}
}
