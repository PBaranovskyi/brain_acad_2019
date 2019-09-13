package tereshchenko_roman.coreJavaClasses;

import java.util.Map;

public class MySystem {
    public static void main(String[] args) {

        Map <String, String> env = System.getenv();

        for (String key : env.keySet()){
            String value = env.get(key);
            System.out.println( key + " " + value);
        }
    }
}
