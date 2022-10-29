package prasad;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleIntrest {
	//static void main(String args[]) {
	 static WebDriver driver;
	public void simple() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
    FileInputStream file=new FileInputStream("C://selenium practise//simple intrest.xlsx"); 
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.findElement(By.id("wzrk-cancel")).click();
    XSSFWorkbook workbook=new XSSFWorkbook(file);
    XSSFSheet sheet=workbook.getSheet("sheet1");
    int rowcount=sheet.getLastRowNum();
   // int Colcount=sheet.getRow(0).getLastCellNum();
    for (int i=1;i<=rowcount;i++) {
    	XSSFRow row=sheet.getRow(i);
    	XSSFCell principle=row.getCell(0);
    	int princ=(int)principle.getNumericCellValue();
    	
    	XSSFCell roi=row.getCell(1);
    	int rateofintrest=(int)roi.getNumericCellValue();
    	
    	XSSFCell period=row.getCell(2);
    	int per=(int)period.getNumericCellValue();
    	
    	XSSFCell frequency=row.getCell(3);
    	String fre=frequency.getStringCellValue();
    	
    	XSSFCell maturity=row.getCell(4);
    	int exp_mat=(int)maturity.getNumericCellValue();
   
    	driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
    	Thread.sleep(2000);
    	driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofintrest));
    	Thread.sleep(2000);
    	driver.findElement(By.name("tenure")).sendKeys(String.valueOf(per));
    	Thread.sleep(2000);
    	
    	Select periodcomb=new Select(driver.findElement(By.id("tenurePeriod")));
    	periodcomb.selectByVisibleText("year(s)");Thread.sleep(2000);
    	
    	Select Frequency=new Select(driver.findElement(By.name("frequency")));
    	Frequency.selectByVisibleText("Simple Interest");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
    	Thread.sleep(2000);
    	
    	String actual_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
    	
    	if ((Double.parseDouble(actual_mvalue))==exp_mat) {
    		System.out.println("Test is Passed");
    	
    	}
    	else {
    		System.out.println("Test is fail");
    	}
    	//driver.findElement(By.id("principal")).clear();
    //driver.findElement(By.id("interest")).clear();
    	//driver.findElement(By.name("tenure")).clear();
    	//driver.findElement(By.id("tenurePeriod")).clear();
    	//driver.findElement(By.name("frequency")).clear();
    	driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
    	//Thread.sleep(3000);
    }
	}
    }

