import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class Sexy {

@Test
    public void test(){
    Driver.getDriver().get("https://www.booking.com/");
    Driver.getDriver().findElement(By.xpath("//div[@class=‘xp__dates-inner’]")).click();
}
}
