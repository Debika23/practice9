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
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	@Test
	public void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Status')]"));
		
		Coordinates cor=((Locatable)ele).getCoordinates();
		cor.inViewPort();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//capturing screenshot
		FileUtils.copyFile(f, new File("C:\\Users\\admin\\online\\7-8\\selscenarios\\target\\screenshot1.png"));
	}

}
