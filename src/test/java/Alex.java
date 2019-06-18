import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Alex {


    @Test
    public void selectDate(int checkIn, int checkOut){

        DateTimeFormatter mainFormat = DateTimeFormatter.ofPattern("ddMMMM yyyy");

        LocalDate dateIn = LocalDate.now().plusDays(checkIn);
        LocalDate dateOut = LocalDate.now().plusDays(checkOut);

        String checkInDate = dateIn.format(mainFormat);
        String checkOutDate = dateOut.format(mainFormat);

//        String checkOutDate = LocalDate.now().plusDays(checkOut).format(mainFormat);

        String daysCheckIn = checkInDate.substring(0,2);
        String monthYearCheckIn = checkInDate.substring(2);

        String daysCheckOut = checkOutDate.substring(0,2);
        String monthYearCheckOut = checkOutDate.substring(2);



        Driver.getDriver().get("https://www.booking.com/");
        Driver.getDriver().findElement(By.xpath("//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]")).click();

        List<WebElement> dates = Driver.getDriver().findElements(By.xpath("//div[@class='bui-calendar__wrapper'][1]//td[@class='bui-calendar__date']"));

        for (WebElement date : dates) {
            System.out.println(date.getText());
        }

    }

}
