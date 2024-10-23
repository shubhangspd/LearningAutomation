package Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop {
public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.in");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			searchBox.sendKeys("dell laptop");	
			driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
			
			driver.findElement(By.partialLinkText("Laptop Computers | Dell India")).click();
			
			try 
			{
				driver.findElement(By.partialLinkText("Vostro 3520")).click();
			
				driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
			
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/button[1]")).click();
			}
			catch(NoSuchElementException e)
			{
				searchBox = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/input[1]"));	
				searchBox.sendKeys("Vostro 3520");
				driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/button[2]")).click();
				driver.findElement(By.partialLinkText("Vostro 3520")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/button[1]")).click();
			}
			finally 
			{
				System.out.println("Done");
			}
    }
}
 
