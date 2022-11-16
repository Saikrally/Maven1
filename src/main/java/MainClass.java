import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainClass {

    public static void main(String[] args) {
        WebDriver driver = HelperMethods.driverCreate();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(new ByXPath("//*[@id=\"searchButton\"]")).click();
        driver.get("https://github.com/");
        WebElement button = driver.findElement(new ByXPath("/html/body/div[1]/header/div/div[2]/div/div/div[2]/a"));
        System.out.println("Button text is: " + button.getText());
        if (button.getText().equals("Sign in")) {
            button.click();
            System.out.println("Success!!!");
        } else {
            driver.quit();
            System.out.println("Fail!");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("saikrallyshaman@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("darispaladin1704");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).submit();
        driver.getCurrentUrl().equals("https://github.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
