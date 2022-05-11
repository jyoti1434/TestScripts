package peechee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class loginlocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91939\\Documents\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91939\\Documents\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password= passwordText(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String s= driver.getTitle();
        System.out.println(s);
        String name="Ankit";
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys(password);
        driver.findElement(By.xpath("//div/span[1]/input")).click();
        driver.findElement(By.cssSelector("input#chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();

	}
//to get the password dynamically from  the page,create a method
	public static String passwordText(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
	    //Please use temporary password rahulshettyacademy to Login.
	    String passwordSaved= driver.findElement(By.xpath("//form/p")).getText();
	    String[] passwordsplit1= passwordSaved.split("'");
	    //0th index=Please use temporary password
	    //1st index=rahulshettyacademy' to Login.
	    String password = passwordsplit1[1];
	    return password;
	
	}
	
	}

