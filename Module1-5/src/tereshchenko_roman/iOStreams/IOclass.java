package tereshchenko_roman.iOStreams;

import java.io.*;

public class IOclass {

    public static void main(String[] args) {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("D:/brain_acad_2019/Module1-5/src/tereshchenko_roman/iOStreams/input.txt");
            outputStream = new FileWriter("D:/brain_acad_2019/Module1-5/src/tereshchenko_roman/iOStreams/output.txt");
            int c = 0;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
//                System.out.print(" " + c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
