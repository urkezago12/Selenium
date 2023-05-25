package homeWorkSelenium;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkSelenium06 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select sel=new Select(dropDown);

        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByValue("Thursday");
        Thread.sleep(2000);
        sel.selectByValue("Friday");
        Thread.sleep(2000);
        driver.quit();


    }
}
