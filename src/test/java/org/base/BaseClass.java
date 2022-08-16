package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	public void getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

	public void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public void textFill(WebElement element, String userCredential) {
		element.sendKeys(userCredential);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void toQuit() {
		driver.quit();
	}

	public void dropDown() {
		Actions a = new Actions(driver);
		a.click();

	}

	public void keyPrs() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void getDateAndTime() {
		Date d = new Date();
		System.out.println(d);

	}


}
