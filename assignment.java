import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class assignment {  

	public static void main(String[] args) throws InterruptedException {  

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\VAITIWAR\\Downloads\\Selenium\\chromedriver.exe"); 

		WebDriver driver=new ChromeDriver();  

		// Launch Website  
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php"); 
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("Automate12@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
		//hover mouse on women
		Actions actions = new Actions(driver);
		WebElement women = driver.findElement(By.className("sf-with-ul"));
		actions.moveToElement(women).perform();

		//click tshirt
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//hover mouse on second product displayed
		Actions actions2 = new Actions(driver);
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		actions2.moveToElement(tshirt).perform();
		Thread.sleep(2000); 

		//click on more button
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
		Thread.sleep(2000); 

		//increase quantity
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		Thread.sleep(2000); 

		//dropdown of size
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText("L");
		Thread.sleep(2000); 

		//changing size because L is not available
		Select size2 = new Select(driver.findElement(By.id("group_1")));
		size2.selectByVisibleText("S");
		Thread.sleep(2000);

		//change color
		driver.findElement(By.id("color_14")).click();
		Thread.sleep(2000); 


		// add to cart
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(2000); 

		//driver.switchTo().alert().dismiss();

		//proceed to checkout
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		

		driver.quit();
	}




}