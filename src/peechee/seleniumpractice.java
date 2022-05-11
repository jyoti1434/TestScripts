package peechee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91939\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
       String s= driver.getTitle();
       System.out.println(s);
       driver.findElement(By.id("inputUsername")).sendKeys("jyoti");
       driver.findElement(By.name("inputPassword")).sendKeys("hello123");
       driver.findElement(By.className("signInBtn")).click();
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       driver.findElement(By.cssSelector("input#chkboxTwo")).click();
       driver.findElement(By.linkText("Forgot your password?")).click();
       driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("ankit");
       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ytru.com");
       driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
       driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ankit123@gmail.com");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("9176554888");
       driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
       System.out.println(driver.findElement(By.xpath("//form/p")).getText());
       driver.findElement(By.cssSelector("form div button:nth-child(1)")).click();
       
	}

}
