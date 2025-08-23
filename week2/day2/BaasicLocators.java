package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaasicLocators {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver ();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("The title of the page is: "+title);
	driver.close();
}
	

}
