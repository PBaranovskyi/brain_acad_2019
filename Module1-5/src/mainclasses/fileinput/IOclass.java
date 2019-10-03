package mainclasses.fileinput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOclass {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("/Users/citsym/gitRepos/brain_acad_2019_3/Module1-5/src/mainclasses/fileinput/input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("/Users/citsym/gitRepos/brain_acad_2019_3/Module1-5/src/mainclasses/fileinput/output.txt")) {

            int c = 0;
            while (c != -1) {
                c = fileInputStream.read();
                fileOutputStream.write(c);
            }

            fileOutputStream.write(new byte[]{97, 98, 99});
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
