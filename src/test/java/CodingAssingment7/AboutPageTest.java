package CodingAssingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AboutPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaaboutme.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.cssSelector("h1[class='about-me-section-sub-heading mb-3']"));
        String Str1=el1.getText();
        String Str2="Facts";
        if(Str1.equals(Str2)){
            System.out.println("Sub-heading is as expected");
        }else{
            System.out.println("Mismatch found in sub-heading");
        }
        WebElement el2=driver.findElement(By.cssSelector("div[class='row']>div>h1[class='about-me-section-heading mb-3']"));
        String Str3=el2.getText();
        String Str4="About me";
        if(Str3.equals(Str4)){
            System.out.println("Main heading is as expected");
        }else{
            System.out.println("Mismatch found in the heading");
        }
        List<WebElement> l1=driver.findElements(By.cssSelector("div[class^='skills'] div[class='col-6 col-md-3']"));
        for(WebElement we:l1){
            System.out.println(we.getText());
        }
        driver.quit();
    }
}
