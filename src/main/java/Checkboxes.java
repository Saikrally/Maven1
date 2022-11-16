import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {


  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = HelperMethods.driverCreate();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@value=\"blue\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@value=\"blue\"]")).click();
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//*[@value=\"blue\"]")).isSelected());
    if (!driver.findElement(By.xpath("//*[@value=\"blue\"]")).isSelected()) {
      driver.findElement(By.xpath("//*[@value=\"blue\"]")).click();
    }
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@value=\"yellow\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@value=\"orange\"]")).click();
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//*[@value=\"orange\"]")).isSelected());
    driver.get("http://test.rubywatir.com/radios.php");
    driver.quit();

}

}

