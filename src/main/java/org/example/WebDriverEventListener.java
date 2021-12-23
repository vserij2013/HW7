package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface WebDriverEventListener {

    void beforeAlertAccept(WebDriver driver);
    void afterAlertAccept(WebDriver driver);
    void afterAlertDismiss(WebDriver driver);
    void beforeAlertDismiss(WebDriver driver);
    void beforeNavigateTo(String url, WebDriver driver);
    void afterNavigateTo(String url, WebDriver driver);
    void beforeNavigateBack(WebDriver driver);
    void afterNavigateBack(WebDriver driver);
    void beforeNavigateForward(WebDriver driver);
    void afterNavigateForward(WebDriver driver);
    void beforeNavigateRefresh(WebDriver driver);
    void afterNavigateRefresh(WebDriver driver);
    void beforeFindBy(By by, WebElement element, WebDriver driver);
    void afterFindBy(By by, WebElement element, WebDriver driver);
    void beforeClickOn(WebElement element, WebDriver driver);
    void afterClickOn(WebElement element, WebDriver driver);
    void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend);
    void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend);
    void beforeScript(String script, WebDriver driver);
    void afterScript(String script, WebDriver driver);
    void beforeSwitchToWindow(String windowName, WebDriver driver);
    void afterSwitchToWindow(String windowName, WebDriver driver);
    void onException(Throwable throwable, WebDriver driver);
    <X> void beforeGetScreenshotAs(OutputType<X> target);
    <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot);
    void beforeGetText(WebElement element, WebDriver driver);
    void afterGetText(WebElement element, WebDriver driver, String text);

}
