package dec26;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
public class Verify_Url {
public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String strprotocol="http://";
		String strprotocol1=driver.getCurrentUrl();
		if(strprotocol1.startsWith(strprotocol1))
		{
			System.out.println("url is secured::"+strprotocol1+"  "+strprotocol1);	
		}
		else
		{
			System.out.println("url is not secured::"+strprotocol1+"     "+strprotocol1);
			driver.quit();
		}
	}
}
