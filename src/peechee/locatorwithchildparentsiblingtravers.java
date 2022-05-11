package peechee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locatorwithchildparentsiblingtravers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91939\\Documents\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
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
