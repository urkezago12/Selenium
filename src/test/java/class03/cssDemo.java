package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //click on creTE NEW ACCOUNT
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
        createNewAccount.click();
        //becouse dom doesnt have first name by default
        //it only shows up after click on create new account

        Thread.sleep(2000);
        //enter fisrt name
        WebElement fname = driver.findElement(By.cssSelector("input[name='firstname']"));
        fname.sendKeys("moazam");
    }

}
