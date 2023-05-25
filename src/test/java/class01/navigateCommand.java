package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {

    public static void main(String[] args) throws InterruptedException {

        //create inctance
        WebDriver driver = new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");
        //slow down program
        Thread.sleep(2000);
        //navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");
        //slow down
        Thread.sleep(2000);
        //refresh page
        driver.navigate().refresh();
        //slow down for 1 sec
        Thread.sleep(1000);
        //go back to previus page
        driver.navigate().back();
        //slow down for 2 sec
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        //closing browser
        driver.quit();
        //close the tab
        driver.close();


    }
}
