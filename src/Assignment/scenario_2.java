package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class scenario_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo']")).click();
		driver.findElement(By.xpath("//input[@class='sp__range']"));
//		WebElement ele = driver.findElement(By.id("slider3"));
		
		WebElement slide = driver.findElement(By.xpath("//input[@value='15']"));
//		System.out.println(slide.getLocation());
//		
		Actions act= new Actions(driver);
		act.dragAndDropBy(slide, 1519,548).perform();
		
	}

}
