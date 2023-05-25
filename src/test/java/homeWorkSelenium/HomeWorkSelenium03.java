package homeWorkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkSelenium03 {
    /*
    HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
[9:19 PM]
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new accou
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("uros");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Zagorac");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("6546544846");
        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("1234567489");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Dec");
        driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("17");
        driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1991");
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();




    }
}
