package com.choucair.runner;

import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
public class RunCucumberTest {
    // Cucumber buscará automáticamente:
    // - Features en: src/test/resources/features/
    // - Step definitions en: com.choucair (y subpaquetes)
}
