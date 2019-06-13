package anna.LabWork_2_1.Add_Work_1;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog obj1 = new Dog(); // obj1 - instance - экземпляр объекта
        obj1.setName("Тузик"); //set the Name Тузик

        // print the name to the console
        // вывести на экран, для этого нужно установить метод get
        System.out.println(obj1.getName());

    }
}
