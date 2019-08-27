package Tomashchuk_Anna.Lab2_13_The_Enums.Course_2;

public class Main_Switch {
    public static void main(String[] args) {
        DocumentStatus docSt=DocumentStatus.ARCHIVED;
        switch (docSt){
            case ARCHIVED:
                System.out.println("Moved to Archive");
                break;
            case PUBLISHED:
                System.out.println("PUBLISHED");
                break;
                default:
                    System.out.println("Unknown status");

        }
    }
}
