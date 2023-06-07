package testBase;


import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    public WebDriver driver;
    public Logger logger;
    public ResourceBundle rb;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sande\\Desktop\\webdevlopment\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		opt.addArguments("--remote-allow-origins=*");
	    if(br.equals("chrome")) {
		driver=new ChromeDriver(opt);
	    }
	    else {
	    	driver=new ChromeDriver(opt);
	    }
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(rb.getString("url"));
	    driver.manage().window().maximize();
	
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
