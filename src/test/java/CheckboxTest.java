import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {
    @Test
    public void Test() {
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement option1=driver.findElement(By.xpath("//input[@value='Bike']"));
        WebElement option2=driver.findElement(By.xpath("//input[@value='Car']"));
        option1.click();
        if(option1.isSelected()){
            System.out.println("Check box Bike is toggled on");
        }
        else {
            System.out.println("Check box Bike is toggled off");
        }
        option2.click();
        if(option2.isSelected()){
            System.out.println("Check box Car is toggled on");
        }
        else {
            System.out.println("Check box Bike is toggled off");
            driver.quit();
        }
    }
}
