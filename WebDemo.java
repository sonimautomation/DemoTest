package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://u2hrm.trigent.com/symfony/web/index.php/auth/login/");
		WebElement a = driver.findElement(By.id("txtUsername"));
		a.sendKeys("jeev21051992");
		WebElement b = driver.findElement(By.id("txtPassword"));
		b.sendKeys("welcome");
		b.sendKeys(Keys.ENTER);
	}

}
