import Pages.BasePage;
import org.testng.annotations.Test;

import javax.annotation.Tainted;

public class Scnario2_TC1 extends BaseTest
{
    @Test
    public void  filter_categry_happyScnario ()throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

        BasePage.TodaysDealsButton(driver).click();
        BasePage.SeemoreFilter(driver).click();
        if (BasePage.HeadphonesFilter(driver).isDisplayed())
        {
            BasePage.HeadphonesFilter(driver).click();

        }
        else if (BasePage.GroceryFilter(driver).isDisplayed())
        {
            BasePage.GroceryFilter(driver).click();

        }
        BasePage.DiscountSelector(driver).click();
        BasePage.PaginationLink(driver).click();
        BasePage.ItemSelector(driver).click();
        BasePage.AddToCartButton(driver).click();
    }

}
