package com.devcentre.zagg.appium.isod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;

public class IsodLoginPageTest extends DriverBase {
	/* @Test */
	public static void login() throws InterruptedException {
		try {
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/twLanguage")));
		List<MobileElement> elements = driver.findElementsById("com.zagg.isod:id/twLanguage");
		elements.get(0).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.zagg.isod:id/tieStoreId"))).click();
		driver.findElement(By.id("com.zagg.isod:id/tieStoreId")).sendKeys("devcentrehouse");
		driver.findElement(By.id("com.zagg.isod:id/tiePassword")).sendKeys("password");
		driver.findElement(By.id("com.zagg.isod:id/btnLogin")).click();

	}
}
