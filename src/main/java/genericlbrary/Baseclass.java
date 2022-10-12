package genericlbrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public propertyfile pdata=new propertyfile();
	public webdriverutilitys utilitis=new webdriverutilitys();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void clossapp(ITestResult ist) throws IOException
	{
		String name = ist.getName();
		int status = ist.getStatus();
		if(status==2) {
			photo p=new photo();
			p.takephoto(driver, name);
		}
		driver.quit();
	}
}
