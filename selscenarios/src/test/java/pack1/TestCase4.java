package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	@Test
	public void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("draggable"));
		Actions a=new Actions(driver);
		a.clickAndHold(ele).dragAndDrop(ele, driver.findElement(By.id("droppable"))).build().perform();
		
		a.click(ele);
		a.contextClick(ele);
		a.doubleClick(ele)
;
		a.moveToElement(ele);
	}

}
