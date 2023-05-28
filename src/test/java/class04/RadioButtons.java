package class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
       String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
       String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//find the radio button male and clink on it
        WebElement r1=driver.findElement(By.xpath("//input[@value='Male'and @name='optradio']"));
        r1.click();
//check if the radio buttin r1 is selected
        boolean r1isSelected=r1.isSelected();
        System.out.println("the radio button Male is selected :"+r1isSelected);
//check if radio button is displayed

       boolean r1isDisplayed=r1.isDisplayed();
        System.out.println("the radio button Male is displayed:"+r1isDisplayed);

 //check if the radio button r1 is enabled
             boolean r1isEnabled=r1.isEnabled();
        System.out.println("the radio button Male is enabled:"+r1isEnabled);
//deselected Male radio button (by clicking female button)
        WebElement r2=driver.findElement(By.xpath("//input[@value='Female'and @name='optradio']"));
        r2.click();

    //check if R1 button is deselected
         r1isSelected=r1.isSelected();
        System.out.println("the male radio button is selected:"+r1isSelected);


    }
}
