package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\programs\\project\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
		driver.get("https://www.gmail.com");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		name.sendKeys("lcmatlomabe@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
			Thread.sleep(400);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("27478866");
		Thread.sleep(400);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();

		//check if the primary tab is selected
		Thread.sleep(200);
		WebElement tbl1 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span"));

		WebElement primary = tbl1.findElement(By.xpath("//*[@id=\":2o\"]"));
		boolean val1 = primary.isSelected();
		if (val1){
		System.out.println("Primary is selected by default");
		}else{
		System.out.println("Primary is not selected by default");
		}
		String noEmails= driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span")).getText();
		System.out.println("You have total "+noEmails+ " emails in your mailbox");

		//get sender of nth email
		//locate table
		WebElement tableRow = tbl1.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]"));

		//locate sender
		WebElement senderofEmail = tableRow.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[2]/div/table/tbody/tr[5]/td[5]/div[2]/span"));
		String senderText = senderofEmail.getText();

		//locate subject
		WebElement subofEmail = tableRow.findElement(By.xpath("//*[@id=\":4o\"]"));
		String subText = subofEmail.getText();
		System.out.println("sender of nth email is "+senderText);
		System.out.println("Subject of email is "+ subText);


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}


	}
