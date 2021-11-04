import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    @Test
    public void Test() {
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']")).sendKeys("Vladimir");
        driver.findElement(By.xpath("//input[@id='et_pb_contact_email_0']")).sendKeys("vladimir@test.com");
        driver.findElement(By.xpath("//button[@name='et_builder_submit_button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Please refresh the page and try again.')]")));
        String actual = driver.findElement(By.xpath("//p[contains(text(),'Please refresh the page and try again.')]")).getText();
        String expected = "Please refresh the page and try again.";
        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}
