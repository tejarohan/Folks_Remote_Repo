package FaceBookPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void f1() throws InterruptedException {
	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
	  //ChromeDriver d=new ChromeDriver();
	  
	    WebDriver d=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nlstest16@gmail.com");
		 driver.findElement(By.id("pass")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("netlogic123");
		//driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		Thread.sleep(1000);
		System.out.println(driver.executeScript("alert('FaceBook Page LoggedIn Successfully')"));
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
		driver.quit();
	
  }
}
