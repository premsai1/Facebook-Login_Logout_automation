import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * @author Premsai Manthani
 * @Purpose : this program performs the Facebook registerational.
 *
 */
public class Registeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com");
		driver.findElement(By.className("firstname")).sendKeys("premsai");
		driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys("manthani");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("manthanipremsai@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_10']")).sendKeys("*******");
		
	
		
	}

}
