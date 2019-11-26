package allConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSelectTagDropDown {
	@Test
	public void Bootstrapdropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("menu1")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"main\"]/div[3]/ul/li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			// System.out.println("drop down elements is :"+elmts.getText());
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("CSS")) {
				Thread.sleep(2000);
			list.get(i).click();
			break;
			}

		}
	}

}
