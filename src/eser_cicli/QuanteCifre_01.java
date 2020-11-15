package eser_cicli;

import java.util.Scanner;

public class QuanteCifre_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        String numero;
        System.out.println("inserire un numero");
        num= inp.nextInt();
        numero = Integer.toString(num);
        String numeri[] = numero.split("");
        System.out.println("il numero è composto da "+numeri.length+" cifre");
    }
}
