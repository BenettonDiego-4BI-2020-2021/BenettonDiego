package vettori.frequenze;

import java.util.Scanner;

public class VettoriFrequenze {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("quanti caratteri vuoi inserire");
        int n;
        n = inp.nextInt();
        char vett[] = new char[n];
        int frequenze[] = new int[26];

        for (int i = 0; i < n; i++) {
            vett[i] = inp.next().charAt(0);
            frequenze[(int) vett[i] - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (frequenze[i] != 0) {
                System.out.println(((char) (i + 97)) + " -> " + frequenze[i]);
            }
        }
    }
}