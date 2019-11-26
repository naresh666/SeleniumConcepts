package allConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDoubleClick {
	@Test
	public void doubleClick() {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//div[@xpath='1']"));
		action.doubleClick(doubleclick).build().perform();
		
	}

}
