package class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
        createNewAccount.click();
        Thread.sleep(2000);

        //1.find the element accociate with the dropdown

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));

        //2.create an object of the select class and pass in the parameters the element dropdown

        Select sel = new Select(days);

        //3.use method provided in select class to select the option that u desire

        sel.selectByVisibleText("14");
        Thread.sleep(2000);//for observation

        //another method:
        sel.selectByValue("26");
        Thread.sleep(2000);//for observation
        //another method
        sel.selectByIndex(0);
        Thread.sleep(2000);//for observation
        driver.quit();
    }
}
