package tereshchenko_roman.staticMethodsAndFields;

public class MyPyramid {
    public static void printPyramid(int h) {

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h; j++) {
                if (i > (h - j - 1)) {
                    System.out.print(j+i-h+1);
                } else System.out.print(" ");
            }

            for (int f = 1; f < h; f++) {
                if (i > f) {
                    System.out.print(i-f);
                }
            }
            System.out.println();
        }
    }}
//}







