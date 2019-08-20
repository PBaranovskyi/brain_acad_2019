package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Course_1.Mutable;

public class MyInteger {
    // simple mutable class-wrapper for int type
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
