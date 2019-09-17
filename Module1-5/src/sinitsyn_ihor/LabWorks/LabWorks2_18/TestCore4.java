package sinitsyn_ihor.LabWorks.LabWorks2_18;

import java.util.Random;
import java.util.Scanner;

public class TestCore4 {
    public static void main(String[] args) {
        String[] programs = {"calc.exe", "notepad.exe", "explorer.exe", "mspaint.exe"};
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int i = rand.nextInt(programs.length);
        try{
            System.out.println("Executing " + programs[i] + "...");
            Process process = Runtime.getRuntime().exec(programs[i]);
            System.out.println(programs[i] + " was opened!");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("--------------------------------");
        for (int t = 0; t < programs.length; t++) {
            if (t == programs.length -1){
                System.out.print(programs[t]);
            } else {
                System.out.print(programs[t] + ", ");
            }
        }
        System.out.println(".");
        System.out.print("Check your program (enter the name): ");
        System.out.println();
        String prog = scan.nextLine();
        try{
            System.out.println("Executing " + prog + "...");
            Process process = Runtime.getRuntime().exec(prog);
            System.out.println(prog + " was opened!");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
