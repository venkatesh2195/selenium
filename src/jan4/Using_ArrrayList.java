package jan4;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_ArrrayList {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//get collection of windows
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		String title1=driver.switchTo().window(brw.get(1)).getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		String title2=driver.switchTo().window(brw.get(0)).getTitle();
		System.out.println(title2);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(6000);
		driver.close();
	}
}
