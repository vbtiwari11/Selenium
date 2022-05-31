import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.SearchContext;

public class Google_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\VAITIWAR\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");	
		WebElement search =driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("youtube");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement searchutube = driver.findElement(By.partialLinkText("YouTube"));
		searchutube.click();
		Thread.sleep(3000);
		WebElement searchtube = driver.findElement(By.name("search_query"));
		searchtube.click();
		Thread.sleep(3000);
		searchtube.sendKeys("dynamite bts");
		//searchtube.sendKeys("toofan kgf kannada");
	    driver.findElement(By.id("search-icon-legacy")).click();
	    searchtube.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	   driver.findElement(By.partialLinkText("BTS (방탄소년단) 'Dynamite' Official MV by HYBE LABELS")).click();
}

}
