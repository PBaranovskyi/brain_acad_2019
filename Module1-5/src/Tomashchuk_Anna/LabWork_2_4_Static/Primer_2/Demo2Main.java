package Tomashchuk_Anna.LabWork_2_4_Static.Primer_2;

public class Demo2Main {
    public static void main(String[] args) {
        System.out.println("Значение val: "+StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());
        System.out.println();

        StaticMeth.val=4;
        System.out.println("Значение val: "+StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());
    }
}
