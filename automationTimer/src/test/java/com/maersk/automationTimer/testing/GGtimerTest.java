package com.maersk.automationTimer.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.maersk.automationTimer.uiPage.EggTimerPageTest;
import com.maersk.automationTimer.utility.BasePage;


public class GGtimerTest {
	
	public WebDriver wdriver;
	private BasePage mBasePage = new BasePage(wdriver);
	
	String timerDuration = "25";

	private EggTimerPageTest eggtimer; 
	
	BasePage basePage = new BasePage(wdriver);
	
	String url = "https://e.ggtimer.com";
	

	
	
	@Test
	public void timerTest() {
		
		if (wdriver == null) {
			System.out.println("Launching the web browser for the test");
			wdriver = mBasePage.launchBrowser(url);
		} else if ((wdriver != null)) {
			System.out.println("Using the web browser for the test");
		}
		
		eggtimer = new EggTimerPageTest(wdriver);
		eggtimer.assertOnCountdown(timerDuration);
	}

}
