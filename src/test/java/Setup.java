import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    String projectLocation = System.getProperty("user.dir");
    WebDriver driver;

    @BeforeEach
    public void beforeTest(){
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation+"/resource/chromedriver.exe");

        // otworz przegladarke
        driver = new ChromeDriver();

        // przejdz do strony UltimateQA
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    @AfterEach
    public void afterTest() {
        // zamknij przegladarke
        driver.close();
    }

}
