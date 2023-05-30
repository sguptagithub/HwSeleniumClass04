package HwSeleniumClass04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class gotoFaceBook extends CommonMethods {
       /* hw2:
            goto facebook.com
    click on create account
    and select your  date of birth using select class*/
       public static void main(String[] args) throws InterruptedException {
           String URL = "https://www.facebook.com/";
           String browser = "chrome";
           openBrowserAndLaunchApplication("https://www.facebook.com/", "chrome");
           WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
           createAccount.click();
           Thread.sleep(2000);
           WebElement month = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
           Select mon = new Select(month);
           mon.selectByIndex(1);

           WebElement day = driver.findElement(By.xpath("//Select[@name='birthday_day']"));
           Select dy = new Select(day);
           dy.selectByValue("20");

           WebElement year = driver.findElement(By.xpath("//Select[@name='birthday_year']"));
           Select ye = new Select(year);
           ye.selectByVisibleText("1968");
           driver.close();
       }}

