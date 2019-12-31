package dec27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_GetText {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/www.google.com/");
		driver.manage().window().maximize();
		//get text of the link
		String linktext=driver.findElement(By.partialLinkText("Gm")).getText();
		String exptext="gmail";
		if (linktext.equalsIgnoreCase(exptext)) 
		{
			System.out.println("Linktext is matching::"+linktext+"   "+exptext);
		}
		else
		{
			System.out.println("Linktext is not matching::"+linktext+"  "+exptext);
		}
		Thread.sleep(5000);
		driver.close();
	}
}


