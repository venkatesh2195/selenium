package jan7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table6 {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Markets")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Market Stats")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Top Losers in R")).click();   
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.id("gridSource"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(WebElement each:rows)
		{
			List<WebElement>cols=each.findElements(By.tagName("td"));
			for(WebElement eachcell:cols)
			{
				if(eachcell.getText().isEmpty())
				{
					//click on next in footer
					driver.findElement(By.xpath("//th[@class='table-page:next']")).click();		
				}
				System.out.print("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("=============================================================");
		}
}

}



