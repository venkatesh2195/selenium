package dec31;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Counting_Items {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http:/newtours.demoaut.com/");
		driver.manage().window().maximize();
		//click on register link
		driver.findElement(By.partialLinkText("Reg")).click();
		Select country=new Select(driver.findElement(By.name("country")));
		//get clooection of items in listbox
		List<WebElement>listitems=country.getOptions();
		System.out.println("no of items are ::"+listitems.size());
		Thread.sleep(4000);
		for (int i=0;i<listitems.size();i++)
		{
			//get each item name
			String eachitem=listitems.get(i).getText();
			System.out.println(eachitem);
			Thread.sleep(4000);
			//click on each item
			listitems.get(i).click();
		}
		Thread.sleep(4000);
		driver.close();
	}
}