package mainclasses.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class PropertiesHolder {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Properties prop = new Properties();

        prop.load(new FileInputStream("/Users/citsym/gitRepos/brain_acad_2019_3/Module1-5/src/mainclasses/properties/databaseconectivity.properties"));

        System.out.println(prop.getProperty("url"));

//        byte[] arr = new byte[40];
//
//        int read = System.in.read(arr);
//
//        System.out.println(read + " bites amount");
//
//        for (byte b : arr) {
//            System.out.print(Integer.toBinaryString(b) + " ");
//        }

    }
}
