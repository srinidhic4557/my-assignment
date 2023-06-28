package assignmentweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();

		driver.get("http:leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("login")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("bank");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("srinidhi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("balan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("srinidhi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cash");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For Savings");
		driver.findElement(By.name("primaryEmail")).sendKeys("srinidhic4557@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
