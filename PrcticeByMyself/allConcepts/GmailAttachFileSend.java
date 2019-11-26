package allConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailAttachFileSend {
	
	@Test
	public static void attachSendMail() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manambittu6652@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nani6652");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//div[@role='button' and @gh='cm']")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("kumar.naresh155@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@command='Files']/div/div/div")).click();
		
		/* it only usefull for seding a single file
		 
		Runtime.getRuntime().exec("C:\\Users\\naresh\\Downloads\\Video\\fileUploadScript.exe");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\":qw\"]")).click();
		 
		 */
	//if we want send multiple files...use below method
//		Runtime.getRuntime().exec("C:\\Users\\naresh\\Downloads\\Video\\fileUploadScript.exe");
//		driver.findElement(By.xpath("//div[@command='Files']/div/div/div")).click();
		Runtime.getRuntime().exec("C:\\Users\\naresh\\Downloads\\Video\\fileUploadScript2.exe"+""+"C:\\Users\\naresh\\Downloads\\Video\\file1.txt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@command='Files']/div/div/div")).click();
		Runtime.getRuntime().exec("C:\\Users\\naresh\\Downloads\\Video\\fileUploadScript2.exe"+""+"C:\\Users\\naresh\\Downloads\\Video\\file2.txt");
		
	}
}


