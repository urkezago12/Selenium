package homeWorkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkSelenium04 {
   /* @here use css and xpath to dot his
    HW1:
    Open chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    fill in the complete form
      website does not work!!!!!!!!!!!!!!!!!!!!
    */
   public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
      driver.get("http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D");
      driver.manage().window().maximize();

      driver.quit();
   }
}
