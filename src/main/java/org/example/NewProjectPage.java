package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProjectPage extends AbstractPage {

    @FindBy(id = "newblogform-title")
    private WebElement subject;

    @FindBy(xpath = "//div[4]/label/input")
    private WebElement theme;

    @FindBy(name = "new-blogs-button")
    private WebElement create;

    public NewProjectPage(WebDriver driver) {
        super(driver);
    }

    public NewProjectPage setSubject(String subject) {
        this.subject.sendKeys(subject);
        return this;
    }

    public NewProjectPage setTheme() {
        this.theme.click();
        return this;
    }

    public void CreateProject() {
        this.create.click();
    }
}
