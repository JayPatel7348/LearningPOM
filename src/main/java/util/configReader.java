package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Jaypatel
 */
public class configReader {

    static Properties getLoadedPropertiesObject() throws IOException {
        //1 read file
        FileInputStream fis=new FileInputStream("Config/config.properties");
        //2 create object of properties class
        Properties prop=new Properties();
        //3 Load the prop object with file object
        prop.load(fis);

        return prop;  //Important NOTE: prop data type is Properties so the above getLoadedPropertiesObject() datatype is Properties
    }

    public static String getURL() throws IOException
    {
       return getLoadedPropertiesObject().getProperty("url");
    }

    public static String username() throws IOException
    {
        return getLoadedPropertiesObject().getProperty("username");
    }

    public static String password() throws IOException
    {
        return getLoadedPropertiesObject().getProperty("password");
    }
}
