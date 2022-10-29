package prasad;



	
		import java.io.File;
		import java.io.IOException;
		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.events.EventFiringWebDriver;
		public class Screenshot
		{
		public static void main(String[] args) throws IOException
		{
			System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/software-testing.html");
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("/com.prasad/screenshot");
		FileUtils.copyFile(srcfile,destfile);
		}
		
	}


