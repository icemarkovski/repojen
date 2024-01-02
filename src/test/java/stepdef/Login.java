package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login {
	
	WebDriver driver;
	
	@Given("I navigate to Login page")
	public void i_navigate_to_login_page() {
		
		//knkmkmkmkm
		//knkmkmkmkm
		//knkmkmkmkm
		//knkmkmkmkm
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		
}

	@When("I enter valid email adress into the email field")
	public void i_enter_valid_email_adress_into_the_email_field() {
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ice-bt@hotmail.com");
		
		
	  
	}

	@When("I enter valid password into the pasword field")
	public void i_enter_valid_password_into_the_pasword_field() {
		
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("12345");
	    
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	    
	}

	@SuppressWarnings("deprecation")
	@Then("I should successfuly logged in")
	public void i_should_successfuly_logged_in() {
		
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a")).isDisplayed());
		
		System.out.println("successfuly_logged_in");
		
		driver.quit();
	    
	}

}
