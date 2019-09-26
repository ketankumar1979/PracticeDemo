import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
    public static WebDriver driver;
    @Test
    public void demo1(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
       // WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        //driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org");
        //driver.quit();
    }
}
