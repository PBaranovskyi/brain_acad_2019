package Tomashchuk_Anna.LabWork_2_2.VarargsSample3;

public class VarArgs {
    public static void vaTest( String msg,int ...v){
        System.out.println(msg+v.length);
        System.out.println("Содержимое: ");

        for(int i=0; i<v.length;i++){
            System.out.println(" arg "+i+": "+v[i]);

        }
        System.out.println();
    }


}

