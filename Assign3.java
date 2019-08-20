package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign3 {
	public  void count() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\programs\\project\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//C:\Users\User\Downloads\Programs\IEDriverServer_x64_3.14.0
		
		driver.get("https://www.flipkart.com/");
		
		 //Identify all the elements on web page
	       List<WebElement> allElements = driver.findElements(By.xpath("//a"));
	       int linkListCount = allElements.size();
	   	   System.out.println(" Total link is : = "  + linkListCount);    
	   	   System.out.println(allElements);
	   	   
	   	   // print link text and Urls of all links
	   	   driver.navigate().back();
	   	   List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		   for(WebElement link:allLinks){
			
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			}
		   System.out.println("Total links :"+ allLinks .size()+"Links");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign3 obj = new Assign3();
		obj.count();

	}

}
