package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FunctionalUtilities{
	
	public Properties prop=new Properties();
	public FileInputStream fis;
	public WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
	
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");
			ChromeOptions c=new ChromeOptions();
			DesiredCapabilities dc=DesiredCapabilities.chrome();
			dc.acceptInsecureCerts();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			c.merge(dc);
			driver=new ChromeDriver(c);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	}
	public void getScreenshot(String methodname,WebDriver driver) {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
	 
		 String destinationFile=System.getProperty("user.dir")+"\\reports\\"+methodname+".png";
		 try {
			org.apache.commons.io.FileUtils.copyFile(source, new File(destinationFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public void hitUrl(WebDriver driver) {
		String url=prop.getProperty("url");
		driver.get(url);
		
	}
	
}
