package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTest {

	public static void main(String[] args) {

//		
//		  String ProjectPath=System.getProperty("user.dir");
//		  System.out.println("ProjectPath: "+ProjectPath);
//		  System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver.exe");
//		 

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("maven repository");

		driver.close();
//		driver.quit();
	}

}
