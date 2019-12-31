package dec24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ieltsonlinetests.com/account/login?destination=/ielts-online-practice-tests-free");
		driver.manage().window().maximize();
		driver.findElement(By.name("account")).sendKeys("ishikasweety16@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Vasantha");
		driver.findElement(By.name("op")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
