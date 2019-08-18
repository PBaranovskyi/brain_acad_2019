package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

public class IndexOf {
    public static void main(String[] args) {
        // Есть лм в строке str эьль Character- буква
        // И в каком месте, если его нет выдает -1
        String str="Hello Brain_Academy!";

        int i1=str.indexOf('e');
        int i2=str.lastIndexOf('e');
        int i3=str.indexOf('x');
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println();

        int i4=str.indexOf("Hello");
        System.out.println(i4);
        int i5=str.indexOf("Brain");
        System.out.println(i5);
        int i6=str.indexOf("brain");
        System.out.println(i6);





    }
}
