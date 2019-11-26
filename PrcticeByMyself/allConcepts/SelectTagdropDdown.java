package allConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTagdropDdown {
@Test
	public void dropdownmethod() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.close();
		WebElement dropdown=driver.findElement(By.id("day"));
		Select selt=new Select(dropdown);
		selt.selectByVisibleText("7");
		WebElement selected_value=selt.getFirstSelectedOption();
		//with out giving .getText it wil print attribute value thats why we must use .getText() method
		System.out.println("selected value is :"+selected_value.getText());
		// i want to print all months in dropdown list at fb  home page
		WebElement month= driver.findElement(By.id("month"));
		Select month_dropdown=new Select(month);
		List<WebElement> month_elements=month_dropdown.getOptions();
		//it will gives number of elements in dropdown
		int numberOfMonths=month_elements.size();
		System.out.println("Number of months :"+numberOfMonths);
		for(WebElement el1:month_elements) {
			System.out.println("elements in dropdown box is :"+el1.getText());
		}
		driver.close();
		
		
	}
}
