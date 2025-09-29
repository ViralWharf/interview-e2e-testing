package com.choucair.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    private final WebDriver webDriver;

    public Helper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement waitAndFindElement(By locator, int segundos) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(segundos));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
