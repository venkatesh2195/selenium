package dec30;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Listbox {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:/facebook.com");
		driver.manage().window().maximize();
		//store month list box into select class
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		//store year list box into select class
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		boolean value1=monthlistbox.isMultiple();
		System.out.println(value1);
		boolean value2=yearlistbox.isMultiple();
		System.out.println(value2);
		//select item from month list box
		monthlistbox.selectByVisibleText("Jun");
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		//select item from year list box
		yearlistbox.selectByVisibleText("2001");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		//monthlistbox.deselectByValue("Oct");
		yearlistbox.selectByValue("2010");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		monthlistbox.selectByIndex(9);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		yearlistbox.selectByIndex(50);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		driver.close();
	}
}
