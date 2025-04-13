import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    public  void  setUp() {
       // WebDriverManager.chromedriver().setup();
        WebDriverRunner.setWebDriver(WebDriverManager.chromedriver()
                .clearDriverCache()
                //    .driverVersion("121.0.6167.184")
                .create());
       // Configuration.browser = "chrome";
       // Configuration.driverManagerEnabled = true;
       // Configuration.headless = false;
       // Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
