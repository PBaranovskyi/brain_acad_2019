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

        String str1="AO";
        for(int i=1;i<7;i++){
            str1+="P"+i;
        }
        System.out.println(str1); // AOP1P2P3P4P5P6

        System.out.println();

        StringBuilder sb=new StringBuilder("AO");
        for(int i=1; i<7; i++){
            //меняет в себе символы
            sb.append("P");
            sb.append(i);
        }
        System.out.println(sb.toString());


        StringBuilder sb1=new StringBuilder(10);
        sb1.append("Hello..."); // Hello...
        System.out.println(sb1);

        char c='!';
        sb1.append(c); // Hello...!
        System.out.println(sb1);

        sb1.insert(8,"Java"); // Hello...Java!
        System.out.println(sb1);

        sb1.delete(5,8); //HelloJava!
        System.out.println(sb1);


    }
}
