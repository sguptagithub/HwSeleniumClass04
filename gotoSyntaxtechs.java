package HwSeleniumClass04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class gotoSyntaxtechs extends CommonMethods {
    /*
    HW1:
    goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    select , tuesday, thursday and friday one by one
     */
    public static void main(String[] args) throws InterruptedException{
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement days=driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));

        Select da=new Select(days);
        da.selectByVisibleText("tuesday");
        Thread.sleep(2000);
        da.selectByValue("thursday");
        Thread.sleep(2000);
        da.selectByIndex(5);
        Thread.sleep(2000);
        driver.quit();
            }
}
