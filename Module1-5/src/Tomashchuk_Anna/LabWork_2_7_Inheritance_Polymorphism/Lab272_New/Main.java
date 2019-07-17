package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Lab272_New;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("ASUS", 1750.50f, "5982204209");
        Monitor monitor1 = new Monitor("HP", 2076.00f, "1897113008", 4300, 600);
        EthernetAdapter adapt1 = new EthernetAdapter("DELL", 129.80f, "373462",
                400, "19834");

        System.out.println(device1);

    }

}
