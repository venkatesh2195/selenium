package dec27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_Attribute {
private static String Stringlinkurl;
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/www.google.com");
		driver.manage().window().maximize();
		Stringlinkurl=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
		System.out.println("link url");
		driver.close();
	}
}
