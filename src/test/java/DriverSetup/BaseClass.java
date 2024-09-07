package DriverSetup;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
 
public class BaseClass {
	public WebDriver driver;
	public final static int TIMEOUT = 10;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--disable-notifications");
				driver = new ChromeDriver(opt);
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				FirefoxOptions opt = new FirefoxOptions();
				opt.addArguments("--disable-notifications");
				driver = new FirefoxDriver(opt);
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				EdgeOptions opt = new EdgeOptions();
				opt.addArguments("--disable-notifications");
				driver = new EdgeDriver(opt);
			}
			else
			{
				System.out.println("Fatal Error!!!!! Browser is not provided");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
			driver.get(url);
		}
	return driver;
	}
 
}