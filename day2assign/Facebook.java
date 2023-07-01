package week2.day2assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Srinidhi");
        driver.findElement(By.name("lastname")).sendKeys("srinidhi");
        driver.findElement(By.name("reg_email__")).sendKeys("srinidhic4557@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("sri");
        WebElement source = driver.findElement(By.id("day"));
        Select day=new Select(source);
        day.selectByValue("13");
        WebElement source1 = driver.findElement(By.id("month"));
        Select month=new Select(source1);
        month.selectByVisibleText("jan");
        WebElement source2 = driver.findElement(By.id("year"));
        Select year=new Select(source2);
        year.selectByValue("1994");
        driver.findElement(By.xpath("//input[@value='2']")).click();      
        driver.close();
	}

	}


