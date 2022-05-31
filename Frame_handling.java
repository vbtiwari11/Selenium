import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\VAITIWAR\\\\Downloads\\\\Selenium\\\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		d1.switchTo().frame("packageFrame");
		d1.findElement(By.linkText("Alert")).click();
		Thread.sleep(1000);
		//imp to go back to defaultcontent
		d1.switchTo().defaultContent();
		d1.switchTo().newWindow(WindowType.TAB);
		d1.close();
		
	}

}
