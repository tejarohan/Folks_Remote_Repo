package FaceBookPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SendingMessage {
  @Test
  public void f3() throws InterruptedException {
	  WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nlstest16@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("netlogic123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		
		System.out.println("Logged in Successfully");
		
		driver.findElement(By.xpath(".//*[@id='navItem_217974574879787']/a/div/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='u_jsonp_2_j']/button[1]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(".//*[@id='u_0_19']/button[1]"));
		System.out.println("Opened Messages Icon");
  }
}
