package com.choucair.stepDefinitions;

import com.choucair.utils.Config;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.choucair.driver.DriverFactory;
import com.choucair.pageObjects.nombrePagina.LoginPO;
import com.choucair.utils.Constants_Vars;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class LoginSteps {
    private WebDriver webDriver;
    private LoginPO loginPO;

    @Before
    public void setUp() {
        webDriver = DriverFactory.getDriver();
        loginPO = new LoginPO(webDriver);
    }

    @Given("El usuario ingresa a la pagina")
    public void el_usuario_ingresa_a_la_pagina() {
        webDriver.get(Config.get("base.url"));
    }
    @When("El usuario ingresa sus credenciales")
    public void el_usuario_ingresa_sus_credenciales(){
        loginPO.escribirPassword(Constants_Vars.PASSWORD);
        loginPO.escribirUsername(Constants_Vars.USER);
    }
    @Then("El usuario hace login correctamente")
    public void el_usuario_hace_login_correctamente(){
        Assertions.assertEquals("Swag Labs", loginPO.leerTitulo());
        loginPO.presionarBotonLogin();
    }

    @After
    public void shutDown(){
        DriverFactory.quitDriver();
    }
}
