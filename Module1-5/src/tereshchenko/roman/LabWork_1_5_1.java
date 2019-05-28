package tereshchenko.roman;

public class LabWork_1_5_1 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 9) {
            int i = 8;
            if (n>7){
            System.out.print(i);}
            i--;
            if (n>6){
            System.out.print(" " + i);}
            i--;
            if (n>5){
            System.out.print(" " + i);}
            i--;
            if (n>4){
            System.out.print(" " + i);}
            i--;
            if (n>3){
            System.out.print(" " + i);}
            i--;
            if (n>2){
            System.out.print(" " + i);}
            i--;
            if (n>1){
            System.out.print(" " + i);}
            i--;
            if (n>0){
            System.out.println(" " + i);}
            n++;
        }
    }
}

class Version2{
    public static void main(String[] args) {
        int i = 0;
        int x;
        while (i < 8) {
            i++;
            x = i;
            while (x > 1) {
                System.out.print(x + " ");
                x--;
            }
            System.out.println(" 1");
    }
}
}
