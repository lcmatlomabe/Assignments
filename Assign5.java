package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign5
{
ChromeDriver driver;
String snapdealUrl="http://snapdeal.com";
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\programs\\project\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://snapdeal.com");
Actions action=new Actions(driver);
driver.get("http://snapdeal.com");
WebElement signin=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
signin.click();
action.clickAndHold(signin).build().perform();
WebElement login=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));
action.click(login).build().perform();
WebElement btnsignin=driver.findElement(By.xpath("//*[@id=\"checkUser\"]"));
btnsignin.sendKeys("lcmatlomabe@gmail.com");
btnsignin.click();
	}
}
		
		
	
		
		
		
	


