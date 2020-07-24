package TestVagrant.assignment;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestVagrant.assignment.*;
public class testVagAssignmnet extends BaseClass {

	@Test()
	public void testing() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://www.ndtv.com");
		driver.manage().window().maximize();
		PageObjects pg = new PageObjects(driver);
		Thread.sleep(7000);
		pg.NoThanks().click();
		pg.india().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("scroll(0,600)");
		pg.Sections().click();
		pg.Weather().click();
		pg.city().click();
		pg.cityCheck().click();
		boolean flag = pg.validate().isDisplayed();
		Assert.assertEquals(flag, true);
		driver.quit();
	}

}
