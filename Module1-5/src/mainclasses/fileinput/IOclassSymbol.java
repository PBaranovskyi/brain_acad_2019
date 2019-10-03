package mainclasses.fileinput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOclassSymbol {

    public static void main(String[] args) {

        try (FileReader fileInputStream = new FileReader("/Users/citsym/gitRepos/brain_acad_2019_3/Module1-5/src/mainclasses/fileinput/input.txt");
             FileWriter fileOutputStream = new FileWriter("/Users/citsym/gitRepos/brain_acad_2019_3/Module1-5/src/mainclasses/fileinput/output.txt")) {

            int c = 0;
                c = fileInputStream.read();
                fileOutputStream.write(c);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
