package tomashchuk.anna.LabWork_1_5;

public class LabWork_1_5_5 {
    public static void main(String[] args) {
        int sum = 0;
        int avg= 0;;
        for(int i = 1; i < 15; ++i)
        {
            sum += i;   // sum = sum + i;
            avg = sum/i;
        }
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);


    }
}
