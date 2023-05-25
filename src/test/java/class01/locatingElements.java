package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
        //facebook
        driver.get("https:/www.facebook.com");
        //maximaze the window
        driver.manage().window().maximize();
        //send some text in the email
        //find element and ................send some text
        driver.findElement(By.id("email")).sendKeys("urkezagorac@gmail.com");//we can copy id="email" from DOM
        //send some text to the pasword field
        driver.findElement(By.name("pass")).sendKeys("aklsjd");


        //print url on console
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        //print title on console

        String title=driver.getTitle();
        System.out.println(title);
        //confirm that the title is "facebook - log in or sing in"
        if(title.equals("facebook- log in or sing in")){
            System.out.println("title is correct");
        }else{
            System.out.println("title is incorrect");
        }

        //close
        driver.close();


    }
}
