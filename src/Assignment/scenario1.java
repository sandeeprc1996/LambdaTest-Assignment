package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenario1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("simple-form-demo"))
			{
			System.out.println("url contains : "+url);
			}
		
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("45");
		WebElement val = driver.findElement(By.cssSelector("#gettotal > button:nth-child(5)"));
		val.click();
		WebElement d = driver.findElement(By.xpath("//p[@id='addmessage']"));
		String a = d.getText();
		System.out.println(a);
		WebElement valuess = driver.findElement(By.xpath("(//input[@placeholder='Please enter your Message'])[1]"));
		valuess.sendKeys(a);
		driver.findElement(By.id("showInput")).click();
		WebElement values = driver.findElement(By.id("message"));
		String text = values.getText();
		System.out.println(text);
		
		if(a.equals(text))
		{
			System.out.println("same as your message");
		}
	}
}
