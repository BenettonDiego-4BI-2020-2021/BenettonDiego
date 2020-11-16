package eser_cicli;

import java.util.Scanner;

public class SerieNumeri_02 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, primi = 0;
        do {
            System.out.println("inserire i numeri da controllare (inserire 1 per far terminare gli inserimenti)");
            num = inp.nextInt();
            boolean test = true;
            int divisore=2;
            while ((test == true) && (divisore <= num / 2)) {
                if (num % divisore == 0) {
                    test = false;
                }
                divisore += 1;
            }
            if (test) {
                primi += 1;
            }
        } while (num != 1);
        System.out.println("hai inserito " + (primi-1) + " numeri primi");
    }
}
