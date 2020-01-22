package jan7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table2 {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Seleniumscripts_Qedge/Html%20Links/qedgetable.html");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.name("qedgetech"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for (int i=1;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for (int j=0;j<cols.size();j++)
			{
				//capture column text
				String celltext=cols.get(j).getText();
				System.out.print("\t"+celltext);
			}
			driver.close();
		}
	}

}
