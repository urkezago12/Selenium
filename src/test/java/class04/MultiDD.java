package class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDD extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //select mutliple option from multi select dropdown
        //   1.inspect and find the element that has the dropdown

        WebElement DD=driver.findElement(By.xpath("//select[@name='States']"));
        //2.create an object of the select class and pass in the parametars the element dropdown

        Select sel=new Select(DD);
        //check if dd is multi select
        boolean isMul=sel.isMultiple();
        System.out.println("the drop down is multi select:"+isMul);
     //select by visible text

        sel.selectByVisibleText("California");

        //select by value

        sel.selectByValue("Ohio");

        //select by index

        sel.selectByIndex(7);

        //we have deselect methods also available
        sel.deselectByVisibleText("Ohio");


    }
}
