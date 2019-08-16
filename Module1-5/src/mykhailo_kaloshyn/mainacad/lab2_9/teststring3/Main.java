package mykhailo_kaloshyn.mainacad.lab2_9.teststring3;

public class Main {

    public static void main(String[] args) {

        String phrase = "Using methods of class String";
        System.out.println(uniqueChars(phrase));

    }

    static char[] uniqueChars (String s) {

        StringBuilder sb = new StringBuilder (0);
        sb.append(s.charAt(0));

        for (int i=1; i<s.length(); i++) {
            for (int j=0; j<sb.length(); j++) {
                if (s.charAt(i)==sb.charAt(j)) {
                    break;
                } else {
                    if (j!=(sb.length()-1)) {
                        continue;
                    } else {
                        sb.append(s.charAt(i));
                    }
                }
            }
        }

        return sb.toString().toCharArray();
    }
 }
