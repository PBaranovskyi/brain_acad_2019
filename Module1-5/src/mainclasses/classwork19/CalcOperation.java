package mainclasses.classwork19;


@FunctionalInterface
public interface CalcOperation {

    int calc(int a, int b);

    int INT = 3000;

    static int getConst(){
        return INT;
    }


    default String getCalculatorName(int a, int b) {
        return "Windows calculator "  + a + b;
    }

}


