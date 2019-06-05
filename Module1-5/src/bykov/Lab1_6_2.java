public class Lab1_6_2 {


    public static void main(String[] args) {
        int[] a = new int[]{15, 46, 32, 8, 24, 9, 46, 14, 12, 18, 46, 17};
        int aMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > aMax)
                aMax = a[i];
        }
        int aMin = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < aMin)
                aMin = a[i];
        }
        int aAvg = (aMax + aMin) / 2;
        System.out.println("Maximum value from the array is " + aMax);
        System.out.println("Minimum value from the array is " + aMin);
        System.out.println("Average value from the array is " + aAvg);

    }

}