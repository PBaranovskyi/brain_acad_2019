package bilan_max.Generic.Lab2_14_1;

public class MyTuple<A,B,C> {
    private A id;
    private B sum;
    private C number;
    MyTuple(A id,B sum,C number){
        this.id=id;
        this.sum=sum;
        this.number=number;
    }

    public void setId(A id) {
        this.id = id;
    }

    public A getId() {
        return id;
    }

    public void setSum(B sum) {
        this.sum = sum;
    }

    public B getSum() {
        return sum;
    }

    public void setNumber(C number) {
        this.number = number;
    }

    public C getNumber() {
        return number;
    }
}
