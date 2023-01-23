package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	protected static long Wait_Time = 1000L;
	protected static long delay_Time = 2000L;
	protected static long LongDelay_Time = 5000L;
	public static WebDriver driver;
	public static Properties pr;
	public SoftAssert softAssert = new SoftAssert();

	public static Properties loadConfig() throws IOException {
		Properties pr = new Properties();
		File file = new File("../RetirementCalaculator/resources/org.properties");
		FileInputStream fis = new FileInputStream(file);
		pr.load(fis);
		return pr;
	}
	
	@BeforeTest
	public void preCondition() throws IOException {
		driver=invokeBrowser();
		String url=pr.getProperty("baseurl");
		driver.navigate().to(url);
	}

	public static WebDriver invokeBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		pr = loadConfig();
		String browserName = pr.getProperty("browser");
		try {
			if (browserName.equals("chrome")) {
				System.getProperty("webdriver.chrome.driver", "../RetirementCalaculator/Drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("mozila")) {
				System.getProperty("webdriver.gecko.driver", "../RetirementCalaculator/Drivers/geckodriver");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("opera")) {
				System.getProperty("webdriver.opera.driver", "../RetirementCalaculator/Drivers/operadriver");
				driver = new OperaDriver();
			} else {
				driver = new SafariDriver();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(LongDelay_Time, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}

	@AfterTest
	public void postCondition() {
		longDelay();
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	public void longDelay() {
		try {
			Thread.sleep(LongDelay_Time);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public boolean isElementVisible(final WebElement ele) {
		long start = System.currentTimeMillis();
		while (true) {
			if (ele.isDisplayed()) {
				return true;
			} else {
				if (System.currentTimeMillis() - start >= Wait_Time) {
					throw new Error("Timeout reached element not visiblie");
				} else {
					try {
						synchronized (this) {
							wait(200);
						}
					} catch (final InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void switchToNewWindow() {

		/*
		 * String childWindow; childWindow =
		 * driver.getWindowHandles().toArray()[1].toString();
		 * driver.switchTo().defaultContent(); driver.switchTo().window(childWindow);
		 */

		try {
			Set<String> wl = driver.getWindowHandles();
			Iterator<String> itr = wl.iterator();
			String pw = itr.next();
			System.out.println("Window  parent id is" + pw);
			String cw = itr.next();
			System.out.println("Window  child id is" + cw);
			driver.switchTo().window(cw);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public WebDriverWait waitTo() {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		return wait;
	}

	public boolean isElementEnabled(WebElement ele) {
		boolean clickable = true;
		String attr = ele.getAttribute("class");
		if ((attr != null) && (attr.indexOf("disabled") > -1)) {
			clickable = false;
		}
		return clickable;
	}
	
	public String getTitle(WebDriver driver) {
		boolean flag = false;

		String text = driver.getTitle();
		if (flag) {
			System.out.println("Title of the page is: \"" + text + "\"");
		}
		return text;
	}
	
	public boolean inputValue(WebElement element, String text) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
			element.clear();
			element.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}
	
	public void delay() {
		try {
			Thread.sleep(delay_Time);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}
