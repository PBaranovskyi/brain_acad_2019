package mainclasses.equals;

import mainclasses.inheritance2.Bear;
import mainclasses.inheritance2.Tiger;

public class Main {

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger(new String("Vasya"), 6);
        Tiger tiger2 = new Tiger(new String("Vasya"), 6);
        Tiger tiger3 = new Tiger(new String("Vasya"), 6);

        tiger1.setColor("grey");
        tiger2.setColor("blue");

        System.out.println(tiger1 == tiger2);
        System.out.println(5 == 5);


        int a = 5;
        int b = 5;

        System.out.println(a == b);


        Bear bear = new Bear();

        System.out.println(tiger1.equals(tiger2));
        System.out.println(tiger1.equals(bear));





    }
}
