package genericlbrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Driver;
import java.util.Date;
import java.util.jar.Attributes.Name;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.detDSA;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo {
    
	public void takephoto(WebDriver driver, String name) throws IOException {
		 Date d=new Date();
	     String currentdate = d.toString().replaceAll(":", "-");
		TakesScreenshot sc=(TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest=new File(Autoconstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}
}
