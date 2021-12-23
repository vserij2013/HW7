package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;

public abstract class AbstractTest {

    static WebDriver driver;
    //static EventFiringWebDriver eventDriver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        //eventDriver = new EventFiringWebDriver(new ChromeDriver(options));
        //eventDriver.register((org.openqa.selenium.support.events.WebDriverEventListener) new MyWebDriverEventListener());

        driver = new ChromeDriver(options);
    }

    @BeforeEach
    void initMainPage() {
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://diary.ru"), "Страница недоступна");
    }

    @AfterEach
    public void checkBrowser() {
        List<LogEntry> allLogRows = getDriver().manage().logs().get(LogType.BROWSER).getAll();
        if (!allLogRows.isEmpty()) {
            if (allLogRows.size() > 0) {
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }
            Assertions.fail();
        }
    }

    @AfterAll
    public static void exit() {
        if (driver !=null)
            driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
