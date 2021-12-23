package org.example;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class MyShowTest extends AbstractTest {

    @Test
    @DisplayName("Тест ничего не делает - такой тест нам не нужен")
    @Severity(SeverityLevel.TRIVIAL)
    void testTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Сделай скрин")
    @Severity(SeverityLevel.BLOCKER)
    void testFalse() throws InterruptedException {
        Thread.sleep(1000);
        MyUnits.makeScreenshot(getDriver(), "failure- org.example.MyShowTest" + System.currentTimeMillis() + ".png");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Давай логи")
    @Severity(SeverityLevel.TRIVIAL)
    void testLogs() {
        LogEntries browserLogs = getDriver().manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        Assertions.assertEquals(0, allLogRows.size());
        Assertions.assertTrue(allLogRows.isEmpty());
        if (allLogRows.size() > 0) {
            allLogRows.forEach(logEntry -> {
                System.out.println(logEntry.getMessage());
            });
        }
        Assertions.assertTrue(true);
    }

}
