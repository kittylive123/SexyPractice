package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch ("chrome"){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case  "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

        }
//        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver(){
        if( driver != null){
            driver.quit();
            driver = null;
        }
    }


}
