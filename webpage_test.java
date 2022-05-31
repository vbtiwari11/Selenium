import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\VAITIWAR\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		
		d1.navigate().to("http://zero.webappsecurity.com/login.html");
		d1.manage().window().maximize();
		d1.findElement(By.id("user_login")).sendKeys("username");
		d1.findElement(By.name("user_password")).sendKeys("password");
		WebElement submit=d1.findElement(By.name("submit"));
		//WebElement submit= d1.findElement(By.xpath("input[@value='Sign in' and @type='submit']"));
		submit.click();
		String act_title=d1.getTitle();
		System.out.println(act_title);
		System.out.println(d1.getCurrentUrl());
		Thread.sleep(1000);
		d1.navigate().refresh();
		
		
	}

}
