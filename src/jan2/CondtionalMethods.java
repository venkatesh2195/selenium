package jan2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CondtionalMethods {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/www.facebook.com");
		WebElement rentermail=driver.findElement(By.id("u_0_e"));
		boolean value=rentermail.isDisplayed();
		System.out.println(value);
	}

}
