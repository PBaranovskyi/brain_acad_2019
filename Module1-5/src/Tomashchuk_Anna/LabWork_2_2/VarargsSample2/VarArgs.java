package LabWork_2_2.VarargsSample2;

public class VarArgs {
    public static void vaTest( int ...v){
        System.out.println("Количество аргументов: "+v.length);
        System.out.println("Содержимое: ");

        for(int i=0; i<v.length;i++){
            System.out.println(" arg "+i+": "+v[i]);

        }
        System.out.println();
    }


}

