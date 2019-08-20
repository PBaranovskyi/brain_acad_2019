package mainclasses.innerClasses;

public class OuterClass {

    void method(){
        final int y = 0;

        class InnerClass implements HasAction{
            public void action(){
                System.out.println(y);
            }
        }

        HasAction obj = new InnerClass();
        obj.action();

//        y++;
        System.out.println("outer " + y);

    }

    void method2(){
        final int y = 0;

        HasAction obj = new HasAction() {
            @Override
            public void action() {
                System.out.println(y);
            }
        };
        obj.action();

//        y++;
        System.out.println("outer " + y);

    }


    public static void main(String[] args) {

//        OuterClass newOuterObj = new OuterClass();
//        newOuterObj.method();

    }

}
