package sinitsyn_ihor.LabWorks.LabWorks2_7;

import java.util.Random;

public class Main {
    private static String[] manufacturer = {"Samsung", "Benq", "Sony", "Asus", "Acer"};
    private static int[] resX = {800, 1024, 1152, 1280, 1440, 1600, 1680, 1920};
    private static int[] resY = {600, 768, 648, 720, 800, 900, 1050, 1080};
    private static String[] serNum = {"AN102954", "NE152235", "MK593345", "KR5423945", "KR950432", "TH203454", "ET3485444", "JG593854", "GI56953423"};
    private static String[] macs = {"45-K6-46-G7", "AJ-63-B6-TT", "M5-9G-AC-88", "4A-TT-3B-26", "84-77-B5-1G", "9G-TY-V6-83", "DF-4V-DC-2B"};

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int r = rand.nextInt(resX.length);
            Monitor newMon = new Monitor(manufacturer[rand.nextInt(manufacturer.length)], rand.nextFloat(), serNum[rand.nextInt(serNum.length)], resX[r], resY[r]);
            System.out.println(newMon);
        }
        for (int i = 0; i < 5; i++) {
            EthernetAdapter newEA = new EthernetAdapter(manufacturer[rand.nextInt(manufacturer.length)], rand.nextFloat(), serNum[rand.nextInt(serNum.length)], rand.nextInt(999) + 1000, macs[rand.nextInt(macs.length)]);
            System.out.println(newEA);
        }
    }
}
