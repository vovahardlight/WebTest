import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button2Test {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebDriverWait wait = new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Raise']")));
        driver.findElement(By.xpath("//button[text()='Raise']")).click();
        String actual=driver.getCurrentUrl();
        String expected = "http://ultimateqa.com/?";
        Assert.assertEquals(expected,actual);
    }
}
