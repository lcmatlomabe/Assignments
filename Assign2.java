package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	ChromeDriver driver;
	String facebookUrl = "http://facebook.com";
	public void navigateCommands()
	{
	String facebookUrl="http://facebook.com";
	driver.navigate().to(facebookUrl);
	String currentUrl= driver.getCurrentUrl();
              System.out.print("currentUrl   "+currentUrl);
              driver.navigate().back();
              driver.navigate().refresh();
	driver.close();
	}
	public  void invokedriver() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\programs\\project\\chromedriver.exe");
            ChromeDriver driver=new ChromeDriver();
            
             driver.get(facebookUrl);
             
            String currentUrl= driver.getCurrentUrl();
            
            WebElement name=driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
            name.sendKeys("Letlhogonolo");
            
           WebElement surname=driver.findElement(By.id("u_0_n"));
            surname.sendKeys("Matlomabe");
            
           WebElement email=driver.findElement(By.id("u_0_q"));
           email.sendKeys("lcmatlomabe@gmail.com");
           
		WebElement reemail=driver.findElement(By.id("u_0_t"));
		reemail.sendKeys("lcmatlomabe@gmail.com");
		
		WebElement password=driver.findElement(By.id("u_0_x"));
		password.sendKeys("Matlomabe12");
		
		WebElement day=driver.findElement(By.id("day"));
		day.sendKeys("27");
		day.isSelected();
		
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("December");
		month.isSelected();
		
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("1995");
		year.isSelected();
		
		WebElement gender=driver.findElement(By.id("u_0_6"));
		gender.click();
		gender.isSelected();
		
		WebElement signin=driver.findElement(By.id("u_0_15"));
		signin.click();
		signin.submit();
	
	
		if(currentUrl.equals("http://www.facebook.com"))
		{
			System.out.println(" test case passed:facebook loaded");
		}
		else
		System.out.print("Test case  failed: facebook did not load");
		}
	

	public static void main(String[] args) {
		Assign2 assign2=new Assign2();
		assign2.invokedriver();}
}
