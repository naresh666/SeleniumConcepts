package allConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseRightClick {
	@Test
	public void mouseActions() {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement doubleClick=driver.findElement(By.xpath("//div[@role='main']/p/span"));
		action.contextClick(doubleClick).build().perform();
		// i want to copy one option in double click dropdown menu
		WebElement cutBtn=driver.findElement(By.cssSelector(".context-menu-icon-cut"));
		String cutBtnText=cutBtn.getText();
		System.out.println("cut button text is :"+cutBtnText);
		
		
	}
}
