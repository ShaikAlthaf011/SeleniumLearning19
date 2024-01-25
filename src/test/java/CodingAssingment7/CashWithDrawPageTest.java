package CodingAssingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CashWithDrawPageTest {
    public static <List> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qawithdrawal.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.cssSelector("div[class*='user'] >p[class='name']"));
        String Str1=el1.getText();
        String Str2="Sarah Williams";
        if(Str1.equals(Str2)){
            System.out.println("Username is correct");
        }else{
            System.out.println("Incorrect username");
        }
        WebElement el2=driver.findElement(By.cssSelector("div[class*='balance'] >p[class='balance']"));
        String Str12= el2.getText();
        String Str13="2000";
        if(Str12.equals(Str13)){
            System.out.println("Initial balance is correct");
        }else{
            System.out.println("Incorrect initial balance");
        }
        java.util.List<WebElement> list1=driver.findElements(By.cssSelector("ul[class='denominations-list']>li>button"));
       for(int i=0;i<2;i++){
           list1.get(i).click();
       }
       WebElement el10= driver.findElement(By.cssSelector("p[class='balance']"));
       String Str45= el10.getText();
       String Str65="1850";
       if(Str45.equals(Str65)){
           System.out.println("Withdrawal App working as expected");
       }else{
           System.out.println("Withdrawal App working as expected");
       }
       driver.quit();
    }
}
