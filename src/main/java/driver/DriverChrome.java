package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChrome {
	private static WebDriver driver;
	
	public static DriverChrome hisBrowserWeb() {
		//Certificacion01
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jfbuiles\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		driver= new ChromeDriver(options);
		return new DriverChrome();
	}
	
	public WebDriver on(String url) {
		driver.get(url);
		return driver;
	
	}
}
