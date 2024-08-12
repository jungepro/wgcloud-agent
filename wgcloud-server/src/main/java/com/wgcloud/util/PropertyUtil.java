package com.wgcloud.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertyUtil {

    public static Set<String> getKeys(String fileName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream in = classLoader.getResourceAsStream(fileName);
        Properties p = new Properties();
        Set<String> keySet = null;
        try {
            p.load(in);
            keySet = p.stringPropertyNames();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return keySet;
    }


    public static String get(String fileName, String propertyName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream in = classLoader.getResourceAsStream(fileName);
        Properties p = new Properties();
        String msg = "";
        try {
            p.load(in);
            msg = (String) p.get(propertyName);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;
    }


}
