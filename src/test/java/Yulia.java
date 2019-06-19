import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Yulia {



    public void selectDate (int checkIn, int checkOut){

        DateTimeFormatter mainFormat = DateTimeFormatter.ofPattern("ddMMMM yyyy");
        LocalDate dateIn = LocalDate.now().plusDays(checkIn);
        String checkInDate = dateIn.format(mainFormat);
        String checkOutDate = LocalDate.now().plusDays(checkOut).format(mainFormat);

        String dayCheckIn = checkInDate.substring(0, 2);
        String monthYearCheckIn = checkInDate. substring(2);

        String dayCheckOut = checkOutDate.substring(0, 2);
        String monthYearCheckOut = checkOutDate.substring(2);

        Driver.getDriver().get("https://www.booking.com/");

        Driver.getDriver().findElement(By.xpath("//div[@class='xp__dates-inner']")).click();
        WebElement calendarMonthYear = Driver.getDriver().findElement(By.xpath("//div[@class='bui-calendar__month']"));
        List<WebElement> calendarDay = Driver.getDriver().findElements(By.xpath("//div[@class='bui-calendar__wrapper'][1]//td[@class='bui-calendar__date']"));

        for (WebElement element : calendarDay) {
            System.out.print(element.getText() + "//");
        }
    }


    @Test
    public void testSelectDate(){
        selectDate(50, 53);
    }
}

