package Tomashchuk_Anna.LabWork_2_3.Gupta_5;

public class Office {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Selvan";
        e1.age=19;
        e2.age=21;
        e2.name="Alibaba";
        // e1.printEmp();
        // e2.printEmp();
        System.out.println(e1.name+" "+e1.age);
        System.out.println(e2.name+" "+e2.age);
    }
}
