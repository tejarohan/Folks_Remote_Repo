package FaceBookPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class FriendsList {
  @Test
  public void f4() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nlstest16@gmail.com");
		 driver.findElement(By.id("pass")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("netlogic123");
		//driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/ul/li/div/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_jsonp_2_1']/div/a[3]")).click();
  }
}
