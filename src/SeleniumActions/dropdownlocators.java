package SeleniumActions;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdownlocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91939\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        //driver.findElement(By.id("hrefIncAdt")).click();
        int i=1;
        while(i<5)
        {
        	 driver.findElement(By.id("hrefIncAdt")).click();
        	 i++;
}
        driver.findElement(By.id("btnclosepaxoption")).click();
       //for autosuggestive dropdown
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
       List<WebElement> options=  driver.findElements(By.className("ui-menu-item"));
        for(WebElement option:options)
        {
        	if(option.getText().equalsIgnoreCase("India"))
        	{
        		option.click();
        		
        	}
        }
        //dynamic dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));		
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"))
        
        (//a[@value='MAA'])[2]
       /*static dropdown with select tag
        WebElement staticDropdown= driver.findElement(By.id("ddlModule"));
        Select dropdown=new Select(staticDropdown);
        dropdown.selectByValue("9");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(8);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Server Boards");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        WebElement staticDropdown1= driver.findElement(By.id("ddlManufacturer"));
        Select dropdown1= new Select(staticDropdown1);
        dropdown1.selectByIndex(3);
       System.out.println(dropdown1.getFirstSelectedOption().getText());
        dropdown1.selectByValue("AIC");
       System.out.println(dropdown1.getFirstSelectedOption().getText());
        dropdown1.selectByVisibleText("Z-Micro");
       System.out.println(dropdown1.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        driver.findElement(By.id("search_btn")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.linkText("Intel® Server Board S2600CW Family")).getText(), "Intel® Server Board S2600CW Family");
        
        
        /*driver.findElement(By.xpath("//div[5]/div[2]/div[1]/div[2]")).click();
        driver.findElement(By.className("css-1dbjc4n r-1habvwh r-19fu0aa r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73")).click();
        driver.findElement(By.className("css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73")).click();*/
}

}
/*driver.findElement(By.className("srchButton")).click();
Thread.sleep(2000);
//autosuggestive dropdown
driver.findElement(By.id("custom-search-details-page-textbox")).sendKeys("ind");
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@class='ui-menu-item'] //div[@id='ui-id-205']")).click();*/

