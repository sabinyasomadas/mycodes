package firstPackage;

import java.awt.Frame;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class firstClass {
@Test

	public void firstProgram() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SabinyaSelenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList")));
		a.build().perform();*/
		
		driver.get("https://accounts.google.com/signup");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement((By.linkText("Help"))).click();;
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> is=ids.iterator();
		is.next();
		
		driver.switchTo().window(is.next());
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
