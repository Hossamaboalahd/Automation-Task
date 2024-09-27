
import Pages.AllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.List;
public class Task2TC extends BaseTest
{
    @Test
    public void Testcase1_happyScnario() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);


        AllPages.Select_Departure_City(driver).click();
        Thread.sleep(2000);
        AllPages.Item1(driver).sendKeys("CHIKKAMAGALURU");
        Thread.sleep(2000);

        AllPages.Item1(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);



        AllPages.Select_Destination_city(driver).click();
        Thread.sleep(2000);

        AllPages.Item2(driver).sendKeys("BENGALURU");
        Thread.sleep(2000);

        AllPages.Item2(driver).sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        AllPages.Date(driver).click();
        AllPages.Select_Day28(driver).click();


        AllPages.SubmitSearch(driver).click();
        Thread.sleep(3000);


        AllPages.Select_Seat(driver).click();
        Thread.sleep(2000);
        AllPages.Seat_Number5(driver).click();



        AllPages.BoardingPoint(driver).click();
        AllPages.SelectBoardingPoint(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);


        AllPages.DropingPoint(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        AllPages.PassengerDetail(driver).click();

        AllPages.Mobile_Num(driver).sendKeys("6789125987");
        AllPages.Mail(driver).sendKeys("test@mail.com");
        AllPages.Proceed_To_Passenger(driver).click();
        AllPages.Name(driver).sendKeys("hhhhhhh");
        AllPages.Age(driver).sendKeys("26");
        AllPages.Id_Card(driver).sendKeys("111111111111");
        AllPages.Gender(driver).click();
        AllPages.Gender_Search_input(driver).sendKeys("male");
        AllPages.Gender_Search_input(driver).sendKeys(Keys.ENTER);

        AllPages.Concession(driver).click();
        AllPages.Search_Concession_Type(driver).sendKeys("General");
        AllPages.Search_Concession_Type(driver).sendKeys(Keys.ENTER);

        AllPages.Id_Card_Status(driver).click();
        AllPages.Search_Id_Card_Status(driver).sendKeys("PAN");
        AllPages.Search_Id_Card_Status(driver).sendKeys(Keys.ENTER);
        AllPages.Proceed_To_Check(driver).click();

        AllPages.Proceed_To_Pay(driver).click();




    }




}
