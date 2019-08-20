package assignments;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Assign7 {
	WebDriver driver;
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\programs\\project\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(" http://jqueryui.com/droppable");
//		WebElement Draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		Draggable.click();
//		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
//		
//		Actions build =new Actions(driver);
//		build.dragAndDrop(drag, drop).perform();
		
		WebElement frameSelector =driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameSelector);
		Actions Build = new Actions(driver);
		WebElement Draggable = driver.findElement(By.id("draggable"));
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement storeplace = driver.findElement(By.id("droppable"));
		Action DraganDrop = Build.clickAndHold(Draggable).moveToElement(storeplace)
				.release(Draggable)
				.build();
		DraganDrop.perform();
		
		String expected ="#fffa90";
		WebElement droppable = driver.findElement(By.id("droppable"));
		String color =droppable.getCssValue("background-color");
		
		System.out.println(color);
		String hexcolor = Color.fromString(color).asHex();
		System.out.println(hexcolor);
		String actual = hexcolor;
		org.junit.Assert.assertEquals(actual,expected);
		

	}

}
