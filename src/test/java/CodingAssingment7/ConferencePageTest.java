package CodingAssingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ConferencePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaconference.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.cssSelector("div[id='sectionConferenceHomePage']>div>p"));
        String Str1=el1.getText();
        String Str2="Redefining the future of IoT with LoRaWAN";
        if(Str1.equals(Str2)){
            System.out.println("Description is as expected");
        }else{
            System.out.println("Mismatch found in description");
        }
        WebElement el2=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        el2.click();
        WebElement el3=driver.findElement(By.cssSelector("p[class='conference-details-description']"));
        String Str4=el3.getText();
        String Str6="Join Asia’s Largest Conference on LoRaWAN";
        if(Str4.equals(Str6)){
            System.out.println("Description is as expected");
        }else{
            System.out.println("Mismatch found in description");
        }
        List<WebElement> li=driver.findElements(By.cssSelector("div[class='d-flex flex-row justify-content-center']+*"));
        for(WebElement S1:li){
            System.out.println(S1.getText());
        }
        driver.quit();
    }
}
