package tereshchenko_roman.collections.testmap1;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {

    private Map <String, String> dictionary = new HashMap<>();

    public void addNewWord (String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate (String en){
        String translation = dictionary.get(en);
        return translation;
    }

}
