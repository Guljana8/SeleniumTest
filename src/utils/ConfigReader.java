package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
    //THIS METHOD WE NEED TO READ THE PROPERTIES
    public class ConfigReader {
        public static Properties read (String path) throws IOException { //we take a path
//we path this path to the fileInputStream
            var fileInputStream=new FileInputStream(path);
//Then we get the proprieties
            var properties=new Properties();
//We load all the information
            properties.load(fileInputStream);
//We return properties
            return properties;
        }
    }
