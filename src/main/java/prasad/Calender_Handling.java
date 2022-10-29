package prasad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Handling {

	public static void main(String[] args) {
		
    System.setProperty("webdriver,Chrome,driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.godigit.com/international-travel-insurance?utm_source=google&utm_medium=cpc&utm_campaign=Generic_Travel_Insurance_Country&utm_content=UAE_Travel_Insurance_PM&utm_term=travel%20insurance%20uae&gclid=EAIaIQobChMIjN3864_6-AIVmZJmAh2S5wB7EAAYAyAAEgK5LPD_BwE");
    driver.findElement(By.xpath("//*[@id=\"international-travel-form-desktop\"]/div[2]/div/div/img")).click();
    Select year=new Select(driver.findElement(By.xpath("//*[@id=\"pika-title-le\"]/div[2]/select")));
    year.selectByVisibleText("2022");
    for (int i=5;i>=1;i--) {
	driver.findElement(By.xpath("//*[@id=\"pika-title-bj\"]/button[2]")).click();
	String month=driver.findElement(By.xpath("//*[@id=\"pika-title-ui\"]/div[1]/select")).getText();
	if (month.equals("December"))
	{
    driver.findElement(By.linkText("20")).click();
	}
    }
	}
    }
