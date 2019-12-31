package dec25;
import org.openqa.selenium.chrome.ChromeDriver;
public class Titleprint {
public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		//print title of the page and lenth of the title
		String pagetitle=driver.getTitle();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page title length is::"+pagetitle.length());
		//print url of the page and length odf url
		String strurl=driver.getCurrentUrl();
		System.out.println("page url is=="+strurl);
		System.out.println("page url is=="+strurl.length());
		driver.close();		
	}

}
