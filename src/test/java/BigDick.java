import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigDick {

    public void selectDate(final int checkIn, final int checkOut) {

        DateTimeFormatter mainFormat = DateTimeFormatter.ofPattern("ddMMMM yyyy");
        // 09September 2019
        LocalDate dateIn = LocalDate.now().plusDays(checkIn); // generate checkIn date
        LocalDate dateOut = LocalDate.now().plusDays(checkOut); // generate checkout date

        String checkInDate = dateIn.format(mainFormat); // change date according to format
        String checkOutDate = dateOut.format(mainFormat); // change date according to format

        String daysCheckIn = checkInDate.substring(0, 2); // get days from string for checkIn
        String monthYearCheckIn = checkInDate.substring(2); // get month & year for checkIn

        String daysCheckOut = checkOutDate.substring(0, 2); // get days from string for checkOut
        String monthYearCheckOut = checkOutDate.substring(2); // get month & year for checkOut

        Driver.getDriver().get("https://booking.com/");
        Driver.getDriver().findElement(By.xpath("//div[@class='xp__dates-inner']")).click();
        WebElement calendarMonthYear = Driver.getDriver().findElement(By.xpath("//div[@class='bui-calendar__month']"));
        List<WebElement> calendarDay = Driver.getDriver().findElements(By.xpath
                ("//div[@class='bui-calendar__wrapper'][1]//td[@class='bui-calendar__date']"));

        for (WebElement element : calendarDay) {
            System.out.print(element.getText() + "//");
        }

    }
        @Test
        public void testSelectDate() {
            selectDate(50, 53);
        }


//        Map<String, String> date = new HashMap<>();
//        date.put("checkIn", checkInDate);
//        date.put("checkOut", checkOutDate);
    }


