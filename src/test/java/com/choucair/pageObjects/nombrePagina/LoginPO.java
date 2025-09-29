package com.choucair.pageObjects.nombrePagina;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.choucair.utils.Helper;



public class LoginPO {
    private final Helper helper;

    public LoginPO(WebDriver webDriver) {
        this.helper = new Helper(webDriver);
    }

    private final By inputUsernameLocator = By.id("user-name");
    private final By inputPasswordLocator = By.id("password");
    private final By btnLoginLocator = By.id("login-button");
    private final By labelTittleLocator = By.className("login_logo");

    public void escribirUsername(String username){
        WebElement inputUsername = helper.waitAndFindElement(inputUsernameLocator, 20);
        inputUsername.sendKeys(username);
    }

    public void escribirPassword(String password){
        WebElement inputPassword = helper.waitAndFindElement(inputPasswordLocator, 20);
        inputPassword.sendKeys(password);
    }

    public void presionarBotonLogin(){
        WebElement btnLogin = helper.waitAndFindElement(btnLoginLocator, 20);
        btnLogin.click();
    }

    public String leerTitulo(){
        WebElement labelTittle = helper.waitAndFindElement(labelTittleLocator, 20);
        return labelTittle.getText();
    }
}
