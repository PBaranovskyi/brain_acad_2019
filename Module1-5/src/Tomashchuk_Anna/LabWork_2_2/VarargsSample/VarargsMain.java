package Tomashchuk_Anna.LabWork_2_2.VarargsSample;

public class VarargsMain {
    public static void main(String[] args) {
        TestVarArg tstvarg=new TestVarArg();
        int sum0=tstvarg.calcSum();
        int sum1=tstvarg.calcSum(3);
        int sum2=tstvarg.calcSum(55,66);
        int sum5=tstvarg.calcSum(77,55,33,11,99);

        System.out.println(tstvarg.calcSum(sum1)); //3

        //Можно и так и так выводить
        System.out.println(tstvarg.calcSum(sum2)); //121=55+66
        System.out.println(sum2);//121=55+66

        System.out.println(sum5); // 77+55+33+11+99=275
    }
}
