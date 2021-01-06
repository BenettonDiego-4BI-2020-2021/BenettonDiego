package eser_cicli;

import java.util.Scanner;

public class SerieNumerica_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,num_copia;
        System.out.println("inserire i numeri");
        num = inp.nextInt();
        do {
            num_copia=num;
            System.out.println("inserire i numeri");
            num = inp.nextInt();
        } while (num_copia!=num);
        System.out.println("hai inserito 2 volte consecutive lo stesso numero");
    }
}
