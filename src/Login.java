

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author Premsai Manthani
 * @Purpose : this program perform Facebook login automation.
 *
 */
public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mpremsai");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("*******");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement accountSettings = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Account Settings")));
		accountSettings.click();
		WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		logOut.click();

	}
}
