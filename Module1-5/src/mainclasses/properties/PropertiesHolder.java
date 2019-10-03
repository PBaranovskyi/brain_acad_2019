package mainclasses.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesHolder {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Properties prop = new Properties();

        prop.load(new FileInputStream(new File(URI.create("mainclasses/properties/databaseconectivity.properties"))));

        System.out.println(Arrays.toString(File.listRoots()));

        System.out.println(prop.getProperty("url"));
        byte[] arr = new byte[40];

        int read = System.in.read(arr);

        System.out.println(read + " bites amount");

        for (byte b : arr) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }

    }
}
