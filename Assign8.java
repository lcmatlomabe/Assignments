package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\programs\\project\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
		driver.get("https://www.gmail.com");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		name.sendKeys("lcmatlomabe@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
		Thread.sleep(300);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("27478866");
		Thread.sleep(400);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		WebElement userProfile = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span"));
		
		boolean val1 = userProfile.isDisplayed();
		
		if (val1){
		System.out.println("gmail is logged in successfully");
		}

		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\":o5\"]")).sendKeys("saurabh@qatechhub.com");
		driver.findElement(By.xpath("//*[@id=\":nn\"]")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//*[@id=\":os\"]")).sendKeys("Hello Saurabh"
				+ "This is a Test mail"
				+ "Regards"
				+ "Letlhogonolo");
		Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}


	}
