package Tomashchuk_Anna.Lab2_13_The_Enums.Course_2;

public class Main {
    public static void main(String[] args) {
        for(DocumentStatus docSt: DocumentStatus.values()){
            System.out.println("" +
                    "Name= "+docSt.name()+",statusCode is "+docSt.getStatusCode());
        }
    }
}
