package jan2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkboxcheck {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.id("remember"));
		//verify checkbox is active or not
		boolean value=checkbox.isEnabled();
		System.out.println(value);
		//verify checkbox is selected or not
		if (checkbox.isSelected())
		{
			//uncheck
			checkbox.click();
		}
		else
		{
			//checkin
			checkbox.click();
		}
		Thread.sleep(5000);
		driver.close();
	}

}
