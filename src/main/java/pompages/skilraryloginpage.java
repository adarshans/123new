package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skilraryloginpage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gear;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement demo;

public  skilraryloginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void skilgear() {
	gear.click();
}
public void skildemo() {
	demo.click();
}
}