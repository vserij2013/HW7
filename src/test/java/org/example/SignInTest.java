package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignInTest extends AbstractTest {

    @Test
    @Epic("Механизмы аутентификации")
    @Description("Аутентификация")
    void SignUp() {
        new DiaryMainPage(getDriver()).goToSignInPage();
        Assertions.assertTrue(getDriver().getTitle().equals("Регистрация — @дневники: асоциальная сеть"), "страница входа недоступна");
        new SignInPage(getDriver()).setUsername("Applanatest1").setPassword("Student2020!").setEmail("vs346751@gmail.com").setIcon().SignUp();
    }

}