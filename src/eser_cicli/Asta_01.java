package eser_cicli;

import java.util.Scanner;

public class Asta_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int contendente1, contendente2;
        System.out.print("contendente 1: ");
        contendente1 = inp.nextInt();
        System.out.print("contendente 2: ");
        contendente2 = inp.nextInt();
        if (contendente2 < contendente1) {
            contendente2 = 0;
        }
        while (contendente1 != 0 && contendente2 != 0) {
            System.out.print("contendente 1: ");
            contendente1 = inp.nextInt();
            if (contendente1 < contendente2) {
                contendente1 = 0;
            } else {
                System.out.print("contendente 2: ");
                contendente2 = inp.nextInt();
                if (contendente2 < contendente1) {
                    contendente2 = 0;
                }
            }
        }
        if (contendente1 == 0) {
            System.out.println("contendente 2 ha vinto l'asta con l'esorbitante cifra di " + contendente2);
        } else {
            System.out.println("contendente 1 ha vinto l'asta con l'esorbitante cifra di " + contendente1);
        }
    }
}
