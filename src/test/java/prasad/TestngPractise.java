package prasad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPractise {
	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9040201%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw54iXBhCXARIsADWpsG9RlrH7DAZVuGcT9YVou6igHgBypx7cjjjIDeG41x5pLiVtVw7eLMsaAhC0EALw_wcB");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test
	public void  VerifyPagetitle() {
	String At=	driver.getTitle();
		System.out.println("The Page Tittle is :"+At);
	Assert.assertEquals(At, "Sign up for Facebook | Facebook");
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
	}

}
