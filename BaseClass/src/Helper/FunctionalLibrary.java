package Helper;

import java.io.FileInputStream;
import java.util.Properties;


public class FunctionalLibrary {
	static Properties prop;
	static WebDriver driver;
	public static String readconfigFile(String key)
	{
		prop=new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"/configuration/config.properties"));
		prop.getProperty(key);
		
		
	}
	public static String readobjfile(String key)
	{
		prop=new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"/configuration/obj.properties"));
		 prop.getProperty(key);
	}
	public static void initialization(String key) {
		String browser=readconfigFile(key);
		if(browser.toUpperCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			driver=new ChromeDriver();
		}
		driver.

		}
	
}
