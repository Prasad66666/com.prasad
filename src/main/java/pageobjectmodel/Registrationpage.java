package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
	
	WebDriver driver;
	
	By Reglink=By.linkText("REGISTER");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By Phone=By.name("phone");
	By Email=By.name("userName");
	By Address=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By Postalcode=By.name("postalCode");
	By Country=By.name("country");
	By Username=By.name("email");
	By Password=By.name("password");
	By cnfPassword=By.name("confirmPassword");
	By Submit=By.name("submit");
	
	Registrationpage(WebDriver d ){
		driver=d;
	}
	
	public void ClickReglink() {
		driver.findElement(Reglink).click();
	}
	public void SetFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void SetLastName(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}
	public void SetPhone(String ph) {
		driver.findElement(Phone).sendKeys(ph);
	}
	public void SetEmail(String mail) {
		driver.findElement(Email).sendKeys(mail);
	}
	
	public void SetAddress(String addr1) {
		driver.findElement(Address).sendKeys(addr1);
	}
	public void SetCity(String ci) {
		driver.findElement(City).sendKeys(ci);
	}
	public void SetState(String st) {
		driver.findElement(State).sendKeys(st);
	}
	public void SetPostalcode(String pc) {
		driver.findElement(Postalcode).sendKeys(pc);
	}
	public void SetCountry(String cn) {
		Select drop = new Select((WebElement) Country);
		drop.selectByVisibleText(cn);
	}
	
	public void SetUsername(String un) {
		driver.findElement(Username).sendKeys(un);
	}
	public void SetPassword(String pw) {
		driver.findElement(Password).sendKeys(pw);
		
	}
	
	public void SetcnfPassword(String cnfp) {
		driver.findElement(cnfPassword).sendKeys(cnfp);
	}
	
	public void SetSubmit(String subbtn) {
	
	
	driver.findElement(Submit).click();
	
}
	
	
	
	
}
