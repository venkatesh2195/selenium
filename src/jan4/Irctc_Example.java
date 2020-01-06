package jan4;
import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Irctc_Example {
private static String pagetitle;
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		Thread.sleep(5000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		Iterator<String>x=brw.iterator();
		while(x.hasNext())
		{
			String child=x.next();
			if(!parent.equals(child))
			{
				pagetitle=driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();	
			}
		}
driver.switchTo().window(parent);
driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("HYDERABAD DECAN - HYB");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("GUNTUR JN - GNT");
Thread.sleep(5000);
driver.close();
	}

}
