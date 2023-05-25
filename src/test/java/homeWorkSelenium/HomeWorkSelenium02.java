package homeWorkSelenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HomeWorkSelenium02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("web oredesr login")){
            System.out.println("the title of page Web Order Login :"+title);
        }else{
            System.out.println("the title of Web Orders Login pase is incorrect");
        }
        Thread.sleep(5000);
        driver.close();
    }
}
