package homeWorkSelenium;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkSelenium07 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://www.fb.com";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement newAcc=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));


        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMounth=new Select(month);
        selectMounth.selectByVisibleText("Dec");
        Thread.sleep(2000);

        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("18");
        Thread.sleep(2000);

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("1991");
        Thread.sleep(2000);

        driver.quit();

    }
}
