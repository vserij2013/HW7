package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(id = "signupform-username")
    private WebElement username;

    @FindBy(id = "signupform-password")
    private WebElement password;

    @FindBy(id = "signupform-email")
    private WebElement email;

    @FindBy(id = "chk_box_user_confirm")
    private WebElement icon;

    @FindBy(id = "signup_btn")
    private WebElement signup;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage setUsername(String username) {
        this.username.sendKeys(username);
        return this;
    }

    public SignInPage setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

    public SignInPage setEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }

    public SignInPage setIcon() {
        this.icon.click();
        return this;
    }

    public void SignUp() {
        this.signup.click();
    }
}
