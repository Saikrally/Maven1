import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdowns {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = HelperMethods.driverCreate();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://semantic-ui.com/modules/dropdown.html");
    driver.findElement(By.xpath("//*[@class=\"ui selection dropdown\"]")).click();
    driver.findElement(By.xpath("//*[@data-value=\"1\"]")).click();
    driver.quit();
}
}
