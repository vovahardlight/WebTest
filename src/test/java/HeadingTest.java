import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
String actual = driver.findElement(By.xpath("//h3")).getText();
String expected = "This section has really simple HTML elements so that you can understand their basic nature. Feel free to practice your test automation on these elements.";
        Assert.assertEquals(expected,actual);
    }
}
