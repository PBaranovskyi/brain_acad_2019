package Tomashchuk_Anna.LabWork_2_3_Constructors.Calling_one_Constr_from_another_this;

public class Office {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp.age);
        System.out.println(emp.name);

        Employee emp1=new Employee(30,"Dima");
        System.out.println(emp1.age+" "+emp1.name);
    }
}
