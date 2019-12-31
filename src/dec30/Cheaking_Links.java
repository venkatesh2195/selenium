package dec30;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cheaking_Links {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/www.amazon.com");
		driver.manage().window().maximize();
		//get collection of links in page which are stored under html tag a
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are;;"+links.size());
		Thread.sleep(4000);
		for (int i=0; i<links.size();i++)
		{
			//get each linktext
			String linkname=links.get(i).getText();
			//get each link url
			String linkurl=links.get(i).getAttribute("href");
			System.out.println(linkname+"\n"+linkurl);		
		}
		Thread.sleep(5000);
		driver.close();
	}
}
