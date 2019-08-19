package tereshchenko_roman.exceptionsAndAssertions;

public class Main3 {


    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(121);
        } catch (InvalidAgeException InvAgeExc){
            System.out.println("The age of a person can't have such value");
            InvAgeExc.printStackTrace();
        }
    }

}

