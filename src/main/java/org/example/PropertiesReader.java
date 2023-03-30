package org.example;

import java.util.Properties;

public class PropertiesReader {

    public static Properties getPropertiesForLanguage(String language) {
        Properties properties = new Properties();
        try {
            properties.load(PropertiesReader.class.getResourceAsStream("/" + language + ".properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
