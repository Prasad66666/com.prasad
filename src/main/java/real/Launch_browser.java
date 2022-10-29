package real;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) throws IOException, Exception {
	System.setProperty("webdriver.chromedriver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	   driver.manage().window().maximize();
	   Properties prop = new Properties();
	   FileInputStream mail = new FileInputStream("C:\\Maven projects\\com.prasad\\src\\test\\Gmail.properties");
	   prop.load(mail);
	   driver.findElement(By.id("firstName")).sendKeys(prop.getProperty("fn"));
	   Thread.sleep(1000);
	   driver.findElement(By.id("lastName")).sendKeys(prop.getProperty("ln"));
	   Thread.sleep(1000);
	   driver.findElement(By.id("username")).sendKeys(prop.getProperty("un"));
	   Thread.sleep(1000);
	   driver.findElement(By.name("Passwd")).sendKeys(prop.getProperty("pass"));
	   Thread.sleep(1000);
	   driver.findElement(By.name("ConfirmPasswd")).sendKeys(prop.getProperty("pass"));
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"]) [2]")).click();
	   
	   driver.findElement(By.xpath("//input[@id=\"phoneNumberId\"]")).click();
	  
      
	}

}
