import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Elturan {

    public void selectDate(int chekIn, int checkOut){

        String format="ddMM yyyy";
        DateTimeFormatter mainFormat=DateTimeFormatter.ofPattern(format);
        LocalDate dateIn=LocalDate.now().plusDays(chekIn);
        LocalDate dateOut=LocalDate.now().plusDays(checkOut);
        String checkInDate=dateIn.format(mainFormat);
        String checkOutDate=dateOut.format(mainFormat);

        String dayCheckIn = checkInDate.substring(0, 2);
        String monthYearCheckIn = checkInDate. substring(2);

        String dayCheckOut = checkOutDate.substring(0, 2);
        String monthYearCheckOut = checkOutDate.substring(2);

        Driver.getDriver().get("https://www.booking.com/");
        Driver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Driver.getDriver().findElement(By.xpath("//div[@class='xp__dates-inner xp__dates__checkin']")).click();
        WebElement month=Driver.getDriver().findElement(By.xpath("//div[@class='bui-calendar__month'][1]"));
        List<WebElement> lstDays=Driver.getDriver().findElements(By.xpath("//div[@class='bui-calendar__wrapper'][1]//td[@class='bui-calendar__date']"));
        for (WebElement lstDay : lstDays) {
            System.out.print(lstDay.getText()+"//");
            
        }

    }

    @Test
    public void testSelectDate(){
        selectDate(20,23);
    }
}
