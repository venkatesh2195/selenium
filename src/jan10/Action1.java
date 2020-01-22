package jan10;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Action1 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//close banner 
		ac.sendKeys(Keys.ESCAPE).build().perform();
		//store men tab
		WebElement men=driver.findElement(By.xpath("//ul[1]/li[3]/span"));
		//move mouse to men tab
		ac.moveToElement(men).build().perform();
		Thread.sleep(5000);
		//move mouse to belt link and click on it
		ac.moveToElement(driver.findElement(By.linkText("Belts")));
		ac.click();
		ac.perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}

















