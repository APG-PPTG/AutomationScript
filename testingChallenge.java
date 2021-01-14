

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testingChallenge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumWebDriverDrivers\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement we1=driver.findElement(By.cssSelector("a[title*='Women']"));
		action.moveToElement(we1).build().perform();
		driver.findElement(By.cssSelector("a[title*='Summer Dresses']")).click();
		Thread.sleep(5000);
		List<WebElement> option= driver.findElements(By.cssSelector("a[itemprop*='url']"));
		for (WebElement we : option) {
			action.moveToElement(we).build().perform();
			driver.findElement(By.cssSelector("a[title='Add to cart']")).click();
			break;
		}
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a.button-medium")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']")).click();
		System.out.println("Print2");
		driver.findElement(By.id("email_create")).sendKeys("peter10@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Peter");
		driver.findElement(By.id("customer_lastname")).sendKeys("Gomes");
		driver.findElement(By.id("passwd")).sendKeys("test123");

		Select dateB=new Select(driver.findElement(By.id("days")));
		dateB.selectByValue("20");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("7");
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("2010");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("firstname")).sendKeys("Peter");
		driver.findElement(By.id("lastname")).sendKeys("Gomes");
		driver.findElement(By.id("company")).sendKeys("Abc.com");
		driver.findElement(By.id("address1")).sendKeys("1234");
		driver.findElement(By.id("city")).sendKeys("Thorold");
		Select State=new Select(driver.findElement(By.id("id_state")));
		State.selectByVisibleText("Alabama");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		Select Country=new Select(driver.findElement(By.id("id_country")));
		Country.selectByVisibleText("United States");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Peter");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.className("bankwire")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		String OrderConfirm=driver.findElement(By.id("order-confirmation")).getText();
		if(OrderConfirm.contains("Your order on My Store is complete"))
		{
			System.out.println("Order Completed");
			driver.close();
		}
		
		}
	

}
