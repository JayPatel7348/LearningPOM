package util;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Jaypatel
 */
public class readPropertyFile {

    public static void main(String[] args) throws IOException {
        //1 read file
        FileInputStream fis=new FileInputStream("Config/config.properties");
        //2 create object of properties class
        Properties prop=new Properties();
        //3 Load the prop object with file object
        prop.load(fis);
        //4 read the value of the key using prop object and getProperty() method
        /*
        String url=prop.getProperty("url");
        System.out.println(url);
        */
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));

    }
}
