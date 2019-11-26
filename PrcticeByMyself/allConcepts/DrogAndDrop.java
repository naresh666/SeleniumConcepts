package allConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DrogAndDrop {
	@Test
	public void Dropdrog() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement sourceelement=driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(sourceelement).moveToElement(targetElement).release().build().perform();
	}

}
