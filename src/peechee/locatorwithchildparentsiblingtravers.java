package peechee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorwithchildparentsiblingtravers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91939\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://google.com/");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//nav/div/ul/li[7]/a")).click();
        driver.findElement(By.id("name")).sendKeys("jyoti");
        driver.findElement(By.xpath("//input[@placeholder='Your Email*']")).sendKeys("kumari.jyoti1434@gmail.com");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.linkText("Automation Practise - 2")).click();
		//absolute xpath 
		System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]")).getText());
		driver.findElement(By.xpath("/html/body/header/div/button[1]")).click();
		//relative xpath parent-child-sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//relative xpath child-parent-child-sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).click();

	}

}
