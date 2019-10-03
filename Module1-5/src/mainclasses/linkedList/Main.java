package mainclasses.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListMy<String> my = new LinkedListMy<>();

        my.add("Vasya");
        my.add("Masha");
        my.add("Lena");


        System.out.println(my);


        my.delete(2);

        System.out.println(my);

    }
}
