package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	@Test
	public void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.id("RoundTrip"))).perform();
		a.sendKeys(driver.findElement(By.id("FromTag")), "abcdef").perform();
		a.sendKeys(driver.findElement(By.id("FromTag")),Keys.TAB).perform();
		a.sendKeys("mnopqrs").perform();
		
		
	}

}
