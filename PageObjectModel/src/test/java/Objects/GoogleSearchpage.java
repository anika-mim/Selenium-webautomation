package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	
	WebDriver driver;
	
	
	public GoogleSearchpage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By searchbox = By.xpath("//input[@name='q']");
	By search_btn = By.xpath("(//input[@name='btnK'])[1]");
	By Facebook_link = By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]");
	
	public void searchgoogle(String Searchinput) {
		// TODO Auto-generated method stub
		
		try {
		
		driver.findElement(searchbox).sendKeys(Searchinput);
		Thread.sleep(3000);
		driver.findElement(search_btn).click();
		Thread.sleep(3000);
	}catch (Exception e) {
		System.out.println("Exceptions Caught" + e.getMessage());
	}


   }
	
	public void ClickFacebook() {
		
		try {
			
			driver.findElement(Facebook_link).click();
			Thread.sleep(3000);
			
		}catch (Exception e) {
			
			System.out.println("Exceptions Caught" + e.getMessage());
		}
		
	}




}	


	


