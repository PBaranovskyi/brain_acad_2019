package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Course_1.Mutable;

public class Main {
    public static void main(String[] args) {
        Integer intObjImm1 = new Integer(10); //Immutable
        //Immutable - значение полей в этих классах нельзя поменять, если поменять, то всегда создасться новый объект.
        // Постоянно будет создаваться новый объект

        MyInteger intObjMut1 = new MyInteger(10); //Mutable
        //Mutable - его можно менять , есть сеттер, ммылка на тот же объект, просто в нем меняется значение

        Integer intObjImm2 = intObjImm1;
        MyInteger intObjMut2 = intObjMut1;

        intObjImm1 = 33;
        intObjMut2.setValue(33);
        System.out.println(intObjImm1);

        // false - different objects
        System.out.println(intObjImm1 == intObjImm2);

        // true - the same objects
        System.out.println(intObjMut1 == intObjMut2);

    }
}
