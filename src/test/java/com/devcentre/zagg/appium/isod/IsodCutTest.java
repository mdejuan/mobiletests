package com.devcentre.zagg.appium.isod;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class IsodCutTest extends DriverBase{
	@Test
	public void cutTest() throws InterruptedException {
		IsodLoginPageTest.login();
		String name = System.getProperty("param1");
		if(name != null && !name.equals(""))
		{
			name.replace("_", " ");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/search_input"))).sendKeys(name);
		}
		else wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/search_input"))).sendKeys("huawei");
			
		Thread.sleep(3000);
		
		List<MobileElement> elements= driver.findElementsById("com.zagg.isod:id/productImageView");
		elements.get(0).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/requestBlankPatternButtonNext"))).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("com.zagg.isod:id/validcode")).sendKeys("az4nx2g");
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.zagg.isod:id/btnNext")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/btnLoad"))).click();
    	Thread.sleep(7000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/btnCut"))).click(); 
    	Thread.sleep(7000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/btnUnload"))).click();
		
		/*String name = System.getProperty("param1");*/
		System.out.println("/////////////////////"+name);
    	
	}
}



		
		
				
				
				
				
				
