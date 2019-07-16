package sinitsyn_ihor.LabWorks.LabWorks2_5;

public class Main {
    public static void main(String[] args) {
        MyInitTest newTest = new MyInitTest();
        System.out.println("Main");
        MyInit firstIn = new MyInit();
        firstIn.printArray(firstIn.getArr());
        MyInit secondIn = new MyInit();
        secondIn.printArray(secondIn.getArr());
        for (int i = 1; i <= 5; i++) {
            InitTest myTest = new InitTest();
            System.out.println("For " + i + " instance" + " id = " + myTest.getId());
        }
    }
}
