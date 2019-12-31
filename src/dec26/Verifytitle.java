package dec26;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verifytitle {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\gmail.com");
		driver.manage().window().maximize();
		String exptitle="gmail";
		//get acttitle
		String acttile=driver.getTitle();
		//verify acttitle equals with exptitle
		if (acttile.equalsIgnoreCase(exptitle))

		{
			System.out.println("Title is matching::"+acttile+"  "+exptitle);	
		}
		else
		{
			System.out.println("Title is no matching::"+acttile+"   "+exptitle);
		}
		Thread.sleep(10000);
		driver.close();
	}

}
