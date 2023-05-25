package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {

        /*
         *task :navigate to google.com
         */
        //declare inctance

        WebDriver driver = new ChromeDriver();
        //use.get(url) to navigate to the desired url
        driver.get("https:/www.google.com");

        //maximaze the window
        driver.manage().window().maximize();

        //get to current url
        String currentUrl = driver.getCurrentUrl();

        //print on console
        System.out.println("the current url of the website is :" + currentUrl);

        //get the title of the page
        String title = driver.getTitle();

        System.out.println("the title of the page is :" + title);

        //add some wait time
            Thread.sleep(5000);


        //close web browser
      driver.quit();
    }
}
