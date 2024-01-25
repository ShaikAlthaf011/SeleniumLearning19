package CodingAssingment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CounterPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacounter.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1 = driver.findElement(By.cssSelector("h1[class='count']"));
        String Str1 = el1.getText();
        String Str2 = "Count 0";
        if (Str1.equals(Str2)) {
            System.out.println("Initial Count Value Checked");
        } else {
            System.out.println("Mismatch Found in Initial Count Value");
        }
        WebElement el2=driver.findElement(By.cssSelector("#root > div > button:nth-child(2)"));
        WebElement el3=driver.findElement(By.cssSelector("#root > div > button:nth-child(3)"));
        int CounterValue=0;
        for(int i=0;i<5;i++){
            el2.click();
            CounterValue++;
        }
        el3.click();
        CounterValue--;
        WebElement el4=driver.findElement(By.cssSelector(".count"));
        String Str25=el4.getText();
        if(Str25.equals("Count "+ CounterValue)){
            System.out.println("Counter App working as expected");
        }else{
            System.out.println("Mismatch found in counter value");
        }
    }
    }

