package com.choucair.utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("config/default.properties")) {
            if (input == null) {
                throw new RuntimeException("No se encontró default.properties");
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
