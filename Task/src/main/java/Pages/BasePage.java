package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage
{
    static By search_text =By.cssSelector("input[type=\"text\"]");
    static By search_btn =By.xpath("//input[@type=\"submit\"]");
    static By items =By.cssSelector("div[data-cy=\"image-container\"]");
    static By countrybutton=By.cssSelector("a[id=\"nav-global-location-popover-link\"]");

    static By ziptext=By.id("GLUXZipUpdateInput");
    static By apply=By.cssSelector("input[aria-labelledby=\"GLUXZipUpdate-announce\"]");
    static By addtocart=By.name("submit.add-to-cart");
  //  static By goto_cart=By.cssSelector("a[data-csa-c-content-id=\"sw-gtc_CONTENT\"]");
    //a[@href='/cart?ref_=sw_gtc']
    static By goto_cart=By.xpath("//a[@href='/cart?ref_=sw_gtc']");

       //driver.findElement(By.id("add-to-cart-button")).click();
   // a[data-csa-c-content-id="sw-gtc_CONTENT"]

    static public WebElement SearchText(WebDriver driver) throws InterruptedException
    {
        WebElement SearchText= driver.findElement(search_text);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchText);

        return SearchText;
    }
    static public WebElement SearchButton(WebDriver driver) throws InterruptedException
    {
        WebElement SearchButton= driver.findElement(search_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchButton);

        return SearchButton;
    }
    static public WebElement Items(WebDriver driver) throws InterruptedException
    {
        List<WebElement> elements= driver.findElements(items);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements.get(0));



        return elements.get(0);
    }

    static public WebElement ChangeCountry(WebDriver driver) throws InterruptedException
    {
        WebElement ChangeCountry= driver.findElement(countrybutton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",countrybutton );

        return ChangeCountry;
    }
    static public WebElement TypeZipCode(WebDriver driver) throws InterruptedException
    {
        WebElement TypeZipCode= (WebElement) driver.findElements(countrybutton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ziptext);


        return TypeZipCode ;
    }
    static public WebElement Apply(WebDriver driver) throws InterruptedException
    {
        WebElement Apply= (WebElement) driver.findElements(apply);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ziptext);


        return Apply ;
    }
    static public WebElement AddToCart(WebDriver driver) throws InterruptedException
    {
        WebElement AddToCart= driver.findElement(addtocart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToCart);

        return AddToCart;
    }
    static public WebElement GoToCart(WebDriver driver) throws InterruptedException
    {
        WebElement GoToCart= driver.findElement(goto_cart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GoToCart);
        return GoToCart;
    }
    //-----------------------------------------------------------------scnario 2-------------------

    static By todaysDealsButton=By.cssSelector("a[aria-label=\"Today's Deals\"]");
    static By seemoreFilter=By.xpath("//a[@href=\"javascript:void(0)\"]");
    static By headphonesFilter = By.cssSelector("FILTER_SELECTOR_FOR_HEADPHONES");
    static By groceryFilter = By.xpath(" //*[ text() = 'Grocery & Gourmet Food' ]");
    static By discountSelector = By.xpath("//*[ text() = '10% off or more' ]");
    static By paginationLink = By.cssSelector("PAGINATION_SELECTOR");
    static By itemSelector = By.cssSelector("ITEM_SELECTOR");
    static By addToCartButton = By.name("submit.add-to-cart");
    static public WebElement TodaysDealsButton(WebDriver driver) throws InterruptedException
    {
        WebElement TodaysDealsButton= driver.findElement(todaysDealsButton);
        return TodaysDealsButton;
    }
    static public WebElement SeemoreFilter(WebDriver driver) throws InterruptedException
    {
        WebElement SeemoreFilter= driver.findElements(seemoreFilter).get(0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SeemoreFilter);

        return SeemoreFilter;
    }
    static public WebElement HeadphonesFilter(WebDriver driver) throws InterruptedException
    {
        WebElement HeadphonesFilter= driver.findElement(headphonesFilter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HeadphonesFilter);

        return HeadphonesFilter;
    }
    static public WebElement GroceryFilter(WebDriver driver) throws InterruptedException
    {
        WebElement GroceryFilter= driver.findElement(groceryFilter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GroceryFilter);

        return GroceryFilter;
    }
    static public WebElement DiscountSelector(WebDriver driver) throws InterruptedException
    {
    WebElement DiscountSelector= driver.findElement(discountSelector);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DiscountSelector);
    Thread.sleep(500);
    return DiscountSelector;
     }
      static public WebElement PaginationLink(WebDriver driver) throws InterruptedException
    {
    WebElement PaginationLink= driver.findElements(paginationLink).get(3);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaginationLink);

    return PaginationLink;
     }
       static public WebElement ItemSelector(WebDriver driver) throws InterruptedException
        {
    WebElement ItemSelector= driver.findElement(itemSelector);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ItemSelector);

    return ItemSelector;
        }
static public WebElement AddToCartButton(WebDriver driver) throws InterruptedException
{
    WebElement AddToCartButton= driver.findElement(addToCartButton);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToCartButton);

    return AddToCartButton;
}
}

