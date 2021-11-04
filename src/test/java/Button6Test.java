import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button6Test {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.findElement(By.xpath("//button[@name='et_builder_submit_button']")).click();
        String actual=driver.findElement(By.xpath("//p[text()='Please refresh the page and try again.']")).getText();
        String expected="Please refresh the page and try again.";
        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}
