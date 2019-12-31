package dec26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Register {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("venkatesh");
		driver.findElement(By.name("lastName")).sendKeys("kilaru");
		driver.findElement(By.name("phone")).sendKeys("9505674749");
		driver.findElement(By.id("username")).sendKeys("venkateshkilaru1996@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("solasa,near anjaneya swami temple");
		driver.findElement(By.name("city")).sendKeys("Guntur");
		driver.findElement(By.name("state")).sendKeys("AndhraPradesh");
		driver.findElement(By.name("postalCode")).sendKeys("522234");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("email")).sendKeys("sambisulthan@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sambi@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("sambi@123");
		driver.findElement(By.name("register")).click();
		Thread.sleep(10000);
	}

}
