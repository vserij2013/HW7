package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiaryMainPage extends AbstractPage {

    @FindBy(linkText = "Регистрация")
    private WebElement signIn;

    @FindBy(xpath = "//li[2]/a/span")
    private WebElement newProject;

    public DiaryMainPage(WebDriver driver) {
        super(driver);
    }

    public void goToSignInPage() {
        signIn.click();
    }

    public void goToNewProjectPage() {
        newProject.click();
    }
}
