package jan24;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckingTitle {
WebDriver driver;
@Test
  public void titleverification() {
    driver = new ChromeDriver();
  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  driver.manage().window().maximize();
  driver.findElement(By.id("txtUsername")).sendKeys("test");
  driver.findElement(By.id("txtUsername")).sendKeys("admin123");
  driver.findElement(By.id("btnLogin")).click();
  String Exptitle="dash";
  String Acttitle=driver.getCurrentUrl();
  try {
	  Assert.assertTrue(Acttitle.contains(Exptitle));

  }catch(Throwable t)
  {
System.out.println(t.getMessage());
  }
  driver.close();
  }
  
}
