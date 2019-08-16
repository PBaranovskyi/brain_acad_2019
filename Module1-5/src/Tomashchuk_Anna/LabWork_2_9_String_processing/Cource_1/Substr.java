package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

public class Substr {
    public static void main(String[] args) {
        String str="Hello Brain_Academy!";

        // с 6-го до конца значения копируем
        String substr1=str.substring(6); //Brain_Academy!
        System.out.println(substr1);

        // с 6-го по 11 элемент
        String substr2=str.substring(6,11); //Brain
        System.out.println(substr2);
    }
}
