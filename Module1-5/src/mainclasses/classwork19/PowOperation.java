package mainclasses.classwork19;

public class PowOperation implements CalcOperation {
    @Override
    public int calc(int a, int b) {
        return (int) Math.pow(a, b);
    }

    @Override
    public String getCalculatorName(int a, int b) {
        return "Pow opertion calculator";
    }
}
