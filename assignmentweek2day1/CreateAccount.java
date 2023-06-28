package assignmentweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();

		driver.get("http:leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
	       
	        driver.findElement(By.id("userName")).sendKeys("demosalesmanager");
	       
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.partialLinkText("CRM/SFA")).click();
	          driver.findElement(By.id("account")).click();
	          driver.findElement(By.id("create account")).click();
	                 driver.findElement(By.xpath("//input[@id='accountName]")).sendKeys("debit limited account");
	          		driver.findElement(By.id("description")).sendKeys("selenium automation tester");
	          		driver.findElement(By.xpath("input[@id=createLeadForm_FirstNameLocal]")).sendKeys("sri");
	                driver.findElement(By.xpath("input[@id=createLeadForm_OwnershipEnumID]")).sendKeys("computer software");
	              driver.findElement(By.xpath("//class[@id=annual revenue]")).sendKeys();
	              
	              System.out.println(driver.getTitle());
	              
                  
		         
          
	}

	
	}


