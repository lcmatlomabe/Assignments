package assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class assign1 {

	// Creating an instance of Firefox Browser
	FirefoxDriver driver;
	String qatechhubUrl = "http://qatechhub.com";
	String facebookUrl = "http://facebook.com";

	public void invokeBrowser() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\programs\\project\\geckodriver.exe");
	      
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get(qatechhubUrl);
		
		driver.get(facebookUrl);
		

		String titleOfThePage = driver.getTitle();

		if (titleOfThePage.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
			System.out.println("Test case PASS");
		} else {
			System.out.println("Test case FAIL");
		}

	}

	public void navigateCommands() {
		String facebookUrl="http://facebook.com"; 
		driver.navigate().to(facebookUrl);

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL :: " + currentUrl);
		
		driver.navigate().back();

		driver.navigate().refresh();

		//driver.navigate().refresh();
		
		driver.close();
	}

	public static void main(String[] args) {
		assign1 assignment = new assign1();

		assignment.invokeBrowser();
		assignment.navigateCommands();

	}

}