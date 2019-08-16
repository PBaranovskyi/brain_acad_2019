package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

public class Main_length {
    public static void main(String[] args) {
        String str="Hello Brain_Academy!!!";
        int len=str.length();
        System.out.println("String Length is: "+len);

        String str1="Hello";
        String str2="Brain_Academy!!!";
        String str3=str1.concat(str2);

        // Так str4=str1+str2 можно писать только для объектов String
        // car1+car2 нельзя писать
        String str4=str1+str2;
        System.out.println(str3);
        System.out.println(str4);

        // Какой символ находится на индекск 0
        char aChar0=str.charAt(0); // H
        System.out.println(aChar0);

        char aChar1=str.charAt(1); // e
        System.out.println(aChar1);

        char aChar19=str.charAt(19); // !
        System.out.println(aChar19);
        System.out.println();



    }
}
