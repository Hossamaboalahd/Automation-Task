import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Scnario1_TC1 extends BaseTest
{
    public void  ChangeCountry ()throws InterruptedException
    {
        driver.findElement(By.id("nav-global-location-popover-link")).click();

        driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("31217");// because first element not available in egypt
        driver.findElement(By.cssSelector("input[aria-labelledby=\"GLUXZipUpdate-announce\"]")).click();// because first element not available in egypt
        driver.navigate().refresh();
    }
@Test
public void Testcase1_happyScnario() throws InterruptedException
{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

     ChangeCountry();

    BasePage.SearchText(driver).sendKeys("car accessories");
    BasePage.SearchButton(driver).click();
    BasePage.Items(driver).click();




    BasePage.AddToCart(driver).click();
    driver.findElement(By.cssSelector(" i[class=\"a-icon a-icon-close\"]")).click();
    BasePage.GoToCart(driver).click();


    boolean itemFound=false;
    List<WebElement> cartItems = driver.findElements(By.cssSelector("span[class=\"a-truncate sc-grid-item-product-title a-size-base-plus\"]"));
    for(int i=0;i<cartItems.size();i++)
    {        String name_of_item=BasePage.Items(driver).getText();
             String name_of_cart_items = cartItems.get(i).getText();
        if(name_of_cart_items.equalsIgnoreCase(name_of_item))
        {
            itemFound=true;
            break;
        }


    }
    Assert.assertTrue(itemFound, "Expected item not found in the cart: ");






}
}
