package tereshchenko_roman.inheritanceAndPolymorphism;

public class Main {

       public static void main(String[] args) {

           Monitor monitor1 = new Monitor("Samsung", 120.25f, "S1234567", 112, 256);
           EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Asus", 56.50f, "A9876543", 512, "Mac");

           System.out.println(monitor1);
           System.out.println(ethernetAdapter1);
    }
}

