package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Book3_Interface;

public class Of76 extends Clowns {
    public static void main(String[] args) {
        Nose[] arr = new Nose[3];
        arr[0] = new Acts();
        arr[1] = new Clowns();
        arr[2] = new Of76();

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].iMethod() //+ " " + i[x].getClass()
            );
        }
    }
}
