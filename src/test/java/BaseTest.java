import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;

    @BeforeClass
    public void setUp(){
        System.out.println("setup method initialised");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        practiceFormPage=new PracticeFormPage(driver);
    }

@AfterClass
public void tearDown(){
   // System.out.println("tearDown method -finished");
         //driver.quit();
        //bu kismi acinca test gecmiyor, kapatinca test geciyor
}
}
