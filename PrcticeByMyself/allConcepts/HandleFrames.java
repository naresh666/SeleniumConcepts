package allConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFrames {
	@Test
	public void Bootstrapdropdown() {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);  we send fream index..it is atarting from zero
		//OR frame name
		
		driver.switchTo().frame("SingleFrame");
	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	}


}
