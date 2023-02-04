package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class scenario3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/input-form-demo']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		SoftAssert src= new SoftAssert();
//		src.assertAll(driver.findElement(By.xpath("//button[.='Submit']")).click());
		driver.findElement(By.id("name")).sendKeys("Sandeep RC");
		driver.findElement(By.id("inputEmail4")).sendKeys("sandeeprc1996@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("140725");
		driver.findElement(By.id("company")).sendKeys("qspider");
		driver.findElement(By.id("websitename")).sendKeys("sandeep");
		WebElement element = driver.findElement(By.name("country"));
		Select sc= new Select(element);
		sc.selectByVisibleText("India");
		driver.findElement(By.name("city")).sendKeys("Davanagere");
		driver.findElement(By.id("inputAddress1")).sendKeys("Halekal");
		driver.findElement(By.id("inputAddress2")).sendKeys("Jagalur");
		driver.findElement(By.id("inputState")).sendKeys("Karnataka");
		driver.findElement(By.id("inputZip")).sendKeys("577553");
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		

	}

}
