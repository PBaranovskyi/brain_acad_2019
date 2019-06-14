package sinitsyn_ihor.Works.additional_practice;

public class Dog {

//    public String name;
//    public int age;
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.name = "Tузик";
        newDog.age = 5;
        System.out.println("Собаку зовут " + newDog.name + " и ему " + newDog.age + " лет.");
    }
}