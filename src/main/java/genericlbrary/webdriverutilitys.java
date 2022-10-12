package genericlbrary;

import java.security.PublicKey;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class webdriverutilitys {
public void mouseover(WebDriver driver, WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
public void dropdown(WebElement ele, String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
public void draganddrop(WebDriver drver, WebElement src, WebElement dest){
	Actions a=new Actions(drver);
	a.dragAndDrop(src, dest).perform();
	
}
public void dubbleclck(WebDriver driver) {
	Actions a=new Actions(driver);
	a.doubleClick().perform();
}
public void rightclick(WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick().perform();
}
public void switchtoframe(WebDriver driver, String ele) {
driver.switchTo().frame(ele);
}
public void swchtotab(WebDriver driver) {
	Set<String> child = driver.getWindowHandles();
	for(String c:child) {
		driver.switchTo().window(c);
	}
	
}
public void swichbackfromframe(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void scrollbar(WebDriver driver, int y, int x) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.ScrollBy("+x+","+y+"");
}
public void popupalert(WebDriver driver) {
	driver.switchTo().alert();
}
}
