import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Span4Test {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        String actual= driver.findElement(By.xpath("//span[text()='Link']")).getText();
        String expected = "Link";
        Assert.assertEquals(actual,expected);
    }
}
