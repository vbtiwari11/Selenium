import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\VAITIWAR\\\\Downloads\\\\Selenium\\\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://google.com");
		d1.navigate().to("https://automationstepbystep.com");
		d1.manage().window().maximize();
		System.out.println(d1.getCurrentUrl());
		System.out.println(d1.getTitle());
		d1.navigate().refresh();
		Thread.sleep(1000);
		String original_handle=d1.getWindowHandle();
		d1.switchTo().window(original_handle);
		//open new window
		d1.switchTo().newWindow(WindowType.WINDOW);
		//open new tab
		d1.switchTo().newWindow(WindowType.TAB);
		//back to original window
		d1.switchTo().window(original_handle);
		
		
		
		
		
		

	}

}
