import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class RadioButtonTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement option1= driver.findElement(By.xpath("//input[@value='male']"));
        WebElement option2= driver.findElement(By.xpath("//input[@value='female']"));
        WebElement option3= driver.findElement(By.xpath("//input[@value='other']"));
        option1.click();
        if (option1.isSelected()){
            System.out.println("Radio Button Male is toggled on");
        }
        else{
            System.out.println("Radio Button Male is toggled on");}
        option2.click();
        if(option2.isSelected()){
            System.out.println("Radio Button Female is toggled on");
        }
        else{
            System.out.println("Radio Button Female is toggled off");}
        option3.click();
        if(option3.isSelected()){
            System.out.println("Radio Button Other is toggled on");
        }
        else{
            System.out.println("Radio Button Other is toggled off");
        }

        driver.quit();
    }
}
