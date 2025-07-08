package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
protected static WebDriver driver;

	public BaseTest(WebDriver driver) {
		this.driver=driver;
		
	}
	public static  WebDriver getDriver(String str) {
		if(str=="chrome") {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(str=="firefox") {
			driver = new FirefoxDriver();
		}else if(str=="edge") {
			driver=new EdgeDriver();
		}else {
			System.out.println("Unsupported browser");
		}
		return driver;
		
	}
	
public  void closeCurrengtBrowser() {
	driver.close();
}
public void tearDown() {
	driver.quit();
}
public  void switchToWindow(String window ) {
	
	driver.switchTo().window(window );
	
}
	
	
}
