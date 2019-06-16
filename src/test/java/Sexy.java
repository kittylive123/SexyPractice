import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class Sexy {

    @Test
    public void test() {
        Driver.getDriver().get("https://www.booking.com/");

    }
}