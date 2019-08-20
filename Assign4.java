package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign4 {
	 ChromeDriver driver;
	public void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\programs\\project\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		WebElement inputproduct=driver.findElement(By.id("gh-ac"));
		inputproduct.sendKeys("Apple watches");
		WebElement category=driver.findElement(By.id("gh-cat"));
		category.sendKeys("All listing");
		category.isSelected();
		WebElement search=driver.findElement(By.id("gh-btn"));
		search.click();
		List<WebElement>results=driver.findElements(By.id("gh-gb"));
		  for(int x=0;x<results.size();x++)
		 {System.out.println(results.get(x).getText()+ ">"+results.get(x).getAttribute("s-item__image-img"));
		  }
		 System.out.println("The total number of links is:" +results.size());	 
   }
	public static void main(String[] args)
	{
		Assign4 assign=new Assign4(); 
		assign.invokebrowser();
		}
	}
	
