package mavenforJenkins.mavenforJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Test
	public void startbrowser() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		String actualtitle = driver.getTitle();

		System.out.println(actualtitle);

		Assert.assertTrue(driver.getTitle().contains(actualtitle));

		driver.quit();
	}

}
