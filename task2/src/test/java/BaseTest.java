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


    }
    @BeforeClass
    public void Website() throws InterruptedException
    {

        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void Home_Before() throws InterruptedException
    {

    }
    @AfterMethod
    public void Home_After() throws InterruptedException
    {

    }
    @AfterClass
    public void returntostart() throws InterruptedException
    {
    }
    @AfterSuite
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }
}
