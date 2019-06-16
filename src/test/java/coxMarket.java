import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class coxMarket {



    @Test
    public void test(){
        selectDate(90,91);
    }

    public  void selectDate(int checkIn, int checkOut) {
        Driver.getDriver().get("https://www.booking.com");

        DateTimeFormatter mainFormat = DateTimeFormatter.ofPattern("ddMMMM yyyy");

        LocalDate dateIn = LocalDate.now().plusDays(checkIn);
        LocalDate dateOut = LocalDate.now().plusDays(checkOut);


        String checkInDate = dateIn.format(mainFormat);
        String checkOutDate = dateOut.format(mainFormat);


        String daysCheckIn = checkInDate.substring(0,2);
        String monthYearCheckIN = checkInDate.substring(2);


        String daysCheckOut = checkOutDate.substring(0,2);
        String monthYearCheckOut = checkOutDate.substring(2);

        Driver.getDriver().findElement(By.xpath("//div[@class='xp__dates xp__group']")).click();
    }
}




