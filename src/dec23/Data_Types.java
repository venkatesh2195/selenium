package dec23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Data_Types {
public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "‪D:/December_Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.quit();
	}

}
