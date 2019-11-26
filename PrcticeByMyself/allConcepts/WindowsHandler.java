package allConcepts;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.larsentoubro.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentWindo=driver.getWindowHandle();
		//System.out.println(parentWindo);
		driver.findElement(By.xpath("//li[@class='lntCorp']//a[contains(text(),'Investors')]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> tabs= new ArrayList<String>(windows);
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Events')]")).click();
		System.out.println(driver.getTitle());
		
		//driver.quit();
	
	}

}
