package dec27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_Command {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("pagetitle{1}::"+driver.getTitle());
		//click on gmail link
		driver.findElement(By.partialLinkText("Gm")).click();
		System.out.println("pagetitle{2}::"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("pagetitle{4}::"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("pagetitle{5}::"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}
}
