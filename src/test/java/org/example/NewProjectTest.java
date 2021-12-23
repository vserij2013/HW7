package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewProjectTest extends AbstractTest {

    @Test
    @Epic("Механизмы аутентификации")
    @Description("Аутентификация")
    void CreateProject() {
        new DiaryMainPage(getDriver()).goToNewProjectPage();
        Assertions.assertTrue(getDriver().getTitle().equals("Создание записи — @дневники: асоциальная сеть"), "страница опубликования недоступна");
        new NewProjectPage(getDriver()).setSubject("453353453").setTheme().CreateProject();
    }

}
