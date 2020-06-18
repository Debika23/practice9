package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Set;

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

public class TestCase6 {

	@Test
	public void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");//0
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'SME Travel')]")).click();//1
		Set<String>wins=driver.getWindowHandles();
		driver.switchTo().window(wins.toArray()[1].toString());
		Thread.sleep(2000);
		driver.findElement(By.id("UserName")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.switchTo().window(wins.toArray()[0].toString());
		driver.close();//spicejet
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
