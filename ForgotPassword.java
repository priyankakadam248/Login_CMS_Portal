import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ForgotPassword {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Selenium\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.bigtreecms.org/admin/login/");
        
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("demo@bigtreecms.org");
        driver.findElement(By.xpath("//button[@value='Submit']")).click();
        
        
        String actualUrl="https://demo.bigtreecms.org/admin/login/forgot-success/";
        String expectedUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        
      } 
}
