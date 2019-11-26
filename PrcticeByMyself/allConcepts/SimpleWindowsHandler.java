package allConcepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowsHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.larsentoubro.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentWindo=driver.getWindowHandle();
		driver.findElement(By.xpath("//li[@class='lntCorp']//a[contains(text(),'Investors')]")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String temp:windows) {
			if(!temp.equalsIgnoreCase(parentWindo)) {
				System.out.println("child window "+temp);
				driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				driver.close();
			}
			System.out.println("parent window "+temp);
		}
		//driver.quit();
	}

}
