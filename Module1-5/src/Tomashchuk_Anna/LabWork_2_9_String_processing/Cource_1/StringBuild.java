package Tomashchuk_Anna.LabWork_2_9_String_processing.Cource_1;

public class StringBuild {
    public static void main(String[] args) {

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
        System.out.println(sb.toString()); // AOP1P2P3P4P5P6


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
