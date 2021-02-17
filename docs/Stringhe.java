package stringhe;

import java.util.Scanner;

public class Stringhe {

    public static void main(String[] args) {
        String s1,s2;
        int controllo = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        s1 = t.nextLine();
        System.out.println("Inserisci la seconda stringa");
        s2 = t.nextLine();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    controllo += 1;
                }
            }
        }
        if (controllo == s1.length()) {
            System.out.println("uguali");
        } else {
            System.out.println("diverse");
        }
    }

}
