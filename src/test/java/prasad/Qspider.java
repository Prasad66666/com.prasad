package prasad;

import java.awt.Dimension;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Point;

public class Qspider {

	private static final RemoteWebDriver f = null;

	public static void main(String[] args) throws Exception {
		//Open the browser
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file://D:/Demo1.html");
		Thread.sleep(2000);
		//Resize the browser
		Dimension d=new Dimension(200, 200);
		
	//	f.manage().window().setPosition(d);
		Thread.sleep(2000);
		//Move the browser
		Point p=new Point(300, 200);
		f.manage().window().setPosition(p);
		Thread.sleep(2000);
		//Maximize the browser
		f.manage().window().maximize();
		}
		
	}


