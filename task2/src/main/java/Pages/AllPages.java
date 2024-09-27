package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllPages
{
    static By select_departure_city = By.xpath("//span[text()='Select Departure City']");
    static By item1 =By.cssSelector("input[placeholder=\"Search Your City Name\"]");
   static By select_destination_city=By.xpath("//span[text()='Select Destination City']");
   static By item2=  By.cssSelector("input[placeholder=\"Search Your City Name\"]");
   static By date=By.id("departDate");
    static By select_day28=By.xpath("//a[text()='28']");
    static By submitsearch=By.id("submitSearch");
    static By select_seat =By.className("selectbutton");
    static By seat_number5=By.className("seatlook");
   static By bording_point= By.xpath("//div[text()='Select Boarding Point']");
   static By selectbording_point=By.cssSelector("div[class=\"pick--val\"]");
   static By selectdroping_point=By.cssSelector("div[class=\"drop--val\"]");
   static By passenger_detail_btn=By.cssSelector("div[class=\"btnPassDetails\"]");
   static By mob_num =By.name("mobileNo");
   static By mail= By.name("email");
   static By proceed_to_passenger=By.cssSelector("div[class=\"navswitchbtn flex-all-c\"]");
   static  By name=By.name("paxName[0]");
   static By age=By.name("paxAge[0]");
   static By id_card=By.name("paxIDCardNo[0]");
   static By gender=By.name("paxGender[0]");
   static By gender_search_input =By.id("searchInput");
   static By concession=By.name("paxConcessionType[0]");
   static By search_concession_type= By.cssSelector("input[placeholder=\"Search Concession Type\"]");
   static By id_Card_status=By.name("paxIDCardType[0]");
   static By search_id_card_status=By.cssSelector("input[placeholder=\"Search ID Type\"]");
   static By proceed_to_check=By.cssSelector("div[tabindex=\"14\"]");
   static By proceed_to_pay=By.cssSelector("div[class=\"flex-all-c navswitchbtn\"]\n");



    static public WebElement Select_Departure_City(WebDriver driver) throws InterruptedException
    {
        WebElement Select_Departure_City= driver.findElement(select_departure_city);
        return Select_Departure_City;
    }
    static public WebElement Item1(WebDriver driver) throws InterruptedException
    {
        WebElement Item1= driver.findElement(item1);
        return Item1;
    }
    static public WebElement Select_Destination_city(WebDriver driver) throws InterruptedException
    {
        WebElement Select_Destination_city= driver.findElement(select_destination_city);
        return Select_Destination_city;
    }
    static public WebElement Item2(WebDriver driver) throws InterruptedException
    {
        WebElement Item2= driver.findElements(item2).get(1);
        return Item2;
    }
    static public WebElement Date(WebDriver driver) throws InterruptedException
    {
        WebElement Date= driver.findElement(date);
        return Date;
    }
    static public WebElement Select_Day28(WebDriver driver) throws InterruptedException
    {
        WebElement Select_Day28= driver.findElement(select_day28);
        return Select_Day28;
    }
    static public WebElement SubmitSearch(WebDriver driver) throws InterruptedException
    {
        WebElement SubmitSearch= driver.findElement(submitsearch);
        return SubmitSearch;
    }
    static public WebElement Select_Seat(WebDriver driver) throws InterruptedException
    {
        WebElement Select_Seat= driver.findElements(select_seat).get(0);
        return Select_Seat;
    }
    static public WebElement Seat_Number5(WebDriver driver) throws InterruptedException
    {
        WebElement Seat_Number5= driver.findElements(seat_number5).get(0);
        return Seat_Number5;
    }
    static public WebElement BoardingPoint(WebDriver driver) throws InterruptedException
    {
        WebElement BoardingPoint= driver.findElement(bording_point);
        return BoardingPoint;
    }
    static public WebElement SelectBoardingPoint(WebDriver driver) throws InterruptedException
    {
        WebElement SelectBoardingPoint= driver.findElement(selectbording_point);
        return SelectBoardingPoint;
    }
    static public WebElement DropingPoint(WebDriver driver) throws InterruptedException
    {
        WebElement DropingPoint= driver.findElement(selectdroping_point);
        return DropingPoint;
    }
    static public WebElement PassengerDetail(WebDriver driver) throws InterruptedException
    {
        WebElement PassengerDetail= driver.findElement(passenger_detail_btn);
        return PassengerDetail;
    }
    static public WebElement Mobile_Num(WebDriver driver) throws InterruptedException
    {
        WebElement Mobile_Num= driver.findElement(mob_num);
        return Mobile_Num;
    }
    static public WebElement Mail(WebDriver driver) throws InterruptedException
    {
        WebElement Mail= driver.findElement(mail);
        return Mail;
    }
    static public WebElement Proceed_To_Passenger (WebDriver driver) throws InterruptedException
    {
        WebElement Proceed_To_Passenger= driver.findElements(proceed_to_passenger).get(0);
        Thread.sleep(2000);
        return Proceed_To_Passenger;
    }
    static public WebElement Name (WebDriver driver) throws InterruptedException
    {
        WebElement Name= driver.findElement(name);
        return Name;
    }
    static public WebElement Age (WebDriver driver) throws InterruptedException
    {
        WebElement Age= driver.findElement(age);
        return Age;
    }
    static public WebElement Id_Card (WebDriver driver) throws InterruptedException
    {
        WebElement Id_Card= driver.findElement(id_card);
        return Id_Card;
    }
    static public WebElement Gender (WebDriver driver) throws InterruptedException
    {
        WebElement Gender= driver.findElement(gender);
        return Gender;
    }
    static public WebElement Gender_Search_input (WebDriver driver) throws InterruptedException
    {
        WebElement Gender_Search_input= driver.findElement(gender_search_input);
        return Gender_Search_input;
    }

    static public WebElement Concession (WebDriver driver) throws InterruptedException

    {
        WebElement Concession= driver.findElement(concession);
        return Concession;
    }
    static public WebElement Search_Concession_Type (WebDriver driver) throws InterruptedException

    {
        WebElement Search_Concession_Type= driver.findElement(search_concession_type);
        return Search_Concession_Type;
    }
    static public WebElement  Id_Card_Status (WebDriver driver) throws InterruptedException

    {
        WebElement Id_Card_Status= driver.findElement(id_Card_status);
        return Id_Card_Status;
    }
    static public WebElement  Search_Id_Card_Status (WebDriver driver) throws InterruptedException

    {
        WebElement Search_Id_Card_Status= driver.findElement(search_id_card_status);
        return Search_Id_Card_Status;
    }
    static public WebElement  Proceed_To_Check (WebDriver driver) throws InterruptedException

    {
        WebElement Proceed_To_Check= driver.findElement(proceed_to_check);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Proceed_To_Check);

        return Proceed_To_Check;
    }
    static public WebElement  Proceed_To_Pay (WebDriver driver) throws InterruptedException

    {
        WebElement Proceed_To_Pay= driver.findElement(proceed_to_pay);
        return Proceed_To_Pay;
    }
    /*



     */
}
