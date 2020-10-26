package com.AmazonShopping.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;
    final static String path="configuration.properties";
    static {
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  String get(String keyName){
        return properties.getProperty(keyName);

    }

}
