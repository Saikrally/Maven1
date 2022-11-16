import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperMethods {
  public static WebDriver driverCreate(){
    System.setProperty("webdriver.chrome.driver", Constants.DRVR_PATH);
    return new ChromeDriver();
  }
}

