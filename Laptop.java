package Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
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
			driver.findElement(By.partialLinkText("Vostro 3520")).click();
			//driver.findElement(By.xpath("//section[@id='bottom-navbar']//button[@role='link'][text()='Add to Cart']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/button[1]")).click();
    }
}
 