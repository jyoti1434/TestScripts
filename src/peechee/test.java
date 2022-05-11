package peechee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91939\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.gmail.com");
	//driver.navigate().to("https://www.gmail.com");
WebElement email= driver.findElement(By.id("identifierId"));
email.sendKeys("kumari.jyoti1434@gmail.com");
driver.findElement(By.id("identifierNext")).click();
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Titanic@143491");
driver.findElement(By.id("password")).click();

	}

}
