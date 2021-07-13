package com.maersk.automationTimer.uiPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maersk.automationTimer.utility.BasePage;
import com.maersk.automationTimer.utility.StopWatch;


public class EggTimerPageTest extends BasePage{
	
	public static WebDriver wdriver;
	StopWatch countdownTimer = new StopWatch();
	
	
	@FindBy(xpath = "//*[@id=\'EggTimer-start-time-input-text\']")
	WebElement inputTextBox; 
	
	@FindBy(xpath = "//button[contains(text(), 'Start')]")
	WebElement startButton;
	
	
	@FindBy(xpath = "//*[@class='ClassicTimer-time']")
	List<WebElement> parentTimer;
	
	
	@FindBy(xpath = "//*[@class='ClassicTimer-inner']")
	List<WebElement> innerTimer;
	
	@FindBy(xpath = "//*[@class='ClassicTimer']")
	WebElement outerTimer;
	
	
	@FindBy(xpath = "//title")
	WebElement title;
	
//		WebDriverWait wait = new WebDriverWait(wdriver, 5);
	
	public EggTimerPageTest(WebDriver wdriver) {
		super(wdriver); // super(wdriver)
		PageFactory.initElements(wdriver, this);
	}
	
	
	public void assertOnCountdown(String duration) {
		
		waitUntilElementAppears(inputTextBox);
		
			inputTextBox.sendKeys(duration);
			startButton.click();
			
			
			
			
			
			
			
			
			//check for dynamic spans on different timer intervals
			
			//my own countdown
			countdownTimer.countdown(duration);
			
			
			 //time left in the countdown
			
			String timerText = title.getAttribute("innerHTML"); 
			
//			while (!timerText.equalsIgnoreCase("time expired!")){
				
				System.out.println(timerText);
				
//			}
			
			System.out.println(timerText);
			
			
			waitUntilElementAppears(outerTimer);
			
			List<WebElement> listChildren =  outerTimer.findElements(By.xpath("//*[@class='ClassicTimer-inner']"));
			
			System.out.println(listChildren);
			
			
			
			// assert on title text timer
			
			
			
			
			
			
			//in the index tag, the countdown is synced 
			
			
			
		
	}

}
