import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest
{
    protected static WebDriver driver;

    @BeforeSuite
    public void DeclareDriver() throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        int width = 1024;
        int height = 768;
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);


        driver.get("https://www.amazon.com/");

        Thread.sleep(10000);
    }
    @BeforeClass
    public void Website() throws InterruptedException
    {
    }
    @BeforeMethod
    public void Home_Before() throws InterruptedException
    {
        Thread.sleep(1000);
    }
    @AfterMethod
    public void Home_After() throws InterruptedException
    {
        Thread.sleep(1000);
    }
    @AfterClass
    public void returntostart() throws InterruptedException
    {
        driver.get("https://amazon.com/");
        Thread.sleep(1000);
    }
    @AfterSuite
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }
}
