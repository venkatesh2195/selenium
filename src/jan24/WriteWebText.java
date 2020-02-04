package jan24;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WriteWebText {
public static void main(String[] args)throws Throwable {
		File f=new File("E://selenium.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.icicibank.com/privacy.page?");
		driver.manage().window().maximize();
String para1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/p[1]")).getText();	
String para2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/p[3]")).getText();
bw.write(para1);
bw.newLine();
bw.newLine();
bw.write(para2);
bw.flush();
bw.close();

	}

}









