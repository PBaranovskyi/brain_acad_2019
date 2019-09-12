package bilan_max.CoreJavaClasses;

import java.math.*;
import  java.util.Random;

public class Factorial {
    public static BigInteger factorial(int value) {

        //Конвертируем полученное число int в BigInteger
        BigInteger res = BigInteger.valueOf(value);

        //Запускаем цикл перемножения. Из i вычитанм 1 на старте, чтобы не умножать число на само себя
        for (int i = (value - 1); i > 0; i--) {
            //Конвертируем i в BigInteger, т.к. в цикле с BigInteger работать нельзя, он не поддерживает стандартные операции
            BigInteger big = BigInteger.valueOf(i);

            // Перемножаем значения используя спец метод BigInteger
            res = res.multiply(big);
        }

        //Возвращаем результат вычислений по окончании цикла
        return res;
    }


    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        Random random = new Random();
        int randomNum = min + random.nextInt((max - min) + 1);
        int value = randomNum;
        //вызов нашего метода и получение значения в BigInteger
        BigInteger result = factorial(value);

        //Вывод результата с BigInteger консоль
        System.out.println("BigInteger:");
        System.out.println(value + "!=" + result);
    }
}
