package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_3_Math_pow_BigDecimal;

import java.math.BigDecimal;

public class Calculation {
    public static void main(String[] args) {
        MyMath myMath=new MyMath();

        int[] arr1 = {7, 18, 23, 42};
        int[] arr2 = {14, 67, 9, 83};

        System.out.println("Minimum value arr1: " + MyMath.findMin(arr1));
        System.out.println("Minimum value arr2: " + MyMath.findMin(arr2));
        System.out.println();
        System.out.println("Maximum value arr1: " + MyMath.findMax(arr1));
        System.out.println("Maximum value arr2: " + MyMath.findMax(arr2));

        System.out.println("Area of circle - whrite radius - r *r * PI: "+MyMath.areaOfCircle(2.75));
        System.out.println("Area of circle - В степени 2 - Math.pow(r,2.0)*PI: "+MyMath.areaOfCircleMath(2.75));
        System.out.println();

        System.out.println("Не округляем: " + MyMath.areaOfCircle(2.75));
        System.out.println("Округляем 1 метод: ((2.7*100.0)/100.0) : " + Math.round(MyMath.areaOfCircle(2.75)*100.0)/100.0);

        // Округляем 2 метод
        //  BigDecimal - округляет, например до 5 числа после запятой, не имеет ограничений double
        BigDecimal decimal = new BigDecimal(MyMath.areaOfCircle(2.75));
        //.doubleValue() - Чтобы был тип double
        //decimal.setScale -- установить размер - 5 знаков после запятой
        double result1 = decimal.setScale(5, BigDecimal.ROUND_FLOOR).doubleValue();
        System.out.println("Округляем до 5 знака после запятой- 2 метод: "+result1);


        // или так можно сделать- просто другая форма записи
        // выносим MyMath.areaOfCircle(2.75) в отдельную переменную area для простоты поимания
        double area=MyMath.areaOfCircle(2.75);
        BigDecimal decimal2 = new BigDecimal(area);
        double result2 = decimal.setScale(5, BigDecimal.ROUND_FLOOR).doubleValue();
        System.out.println("Округляем до 5 знака после запятой- 2 метод, упрощенная запись: "+result2);


    }
}



