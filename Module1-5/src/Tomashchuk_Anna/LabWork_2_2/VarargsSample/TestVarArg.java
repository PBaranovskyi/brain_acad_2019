package Tomashchuk_Anna.LabWork_2_2.VarargsSample;

public class TestVarArg {
    public int calcSum(int... values){
        int res=0;
        for(int x:values){
            res+=x; // res=res+x
        }
        return res;
    }
}
