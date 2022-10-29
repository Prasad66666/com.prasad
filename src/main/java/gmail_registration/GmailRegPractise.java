package gmail_registration;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailRegPractise {

public static void main(String[] args) throws Exception {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
		
		//Navigate to Create account page
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.className("laptop-desktop-only")).click();
		
		//ExcelSheet accessing
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s  = wb.getSheet("Sheet1");
		
		//Enter FirstName and LastName
		driver.findElement(By.name("firstName")).sendKeys(s.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(s.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(3000);
		
		//Enter Suggested mail id
		Scanner phone = new Scanner(System.in);
		System.out.println("Enter Suggested email:");
		String email = phone.nextLine();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(email);
		
		//Enter password*/
		for (int i=1;i<=s.getLastRowNum(); i++) 
		{
			driver.findElement(By.xpath("//input[@name='Passwd']")).clear();
			driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(s.getRow(i).getCell(2).getStringCellValue());
			driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(s.getRow(i).getCell(2).getStringCellValue());	
		}
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		//Enter PhoneNumber
		System.out.println("Enter phone number:");
		String number = phone.nextLine();
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //input[starts-with(@id,'phone')]")).sendKeys(number);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		//Enter otp
		System.out.println("Enter otp:");
		String otp = phone.nextLine();
		phone.close();
		driver.findElement(By.xpath("//input[@name='code']")).sendKeys(otp);
		driver.findElement(By.xpath("//span[text()='Verify']")).click(); 
		Thread.sleep(5000);
		for(int i=1; i<=s.getLastRowNum(); i++)
		{
			//Enter RecoveryMail Id
			driver.findElement(By.name("recoveryEmail")).sendKeys(s.getRow(i).getCell(4).getStringCellValue());	
		}
		Thread.sleep(5000);
		
		//Enter DOB
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("3");
		driver.findElement(By.xpath("//input[@name='day']")).sendKeys("13");
		driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1997");
		
		//Enter gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		//Accepting TermsAndConditions
		driver.findElement(By.xpath("//span[text()='Yes, I’m in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
		wb.close();
       }
       }

