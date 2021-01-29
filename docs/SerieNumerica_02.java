package eser_cicli;

import java.util.Scanner;

public class SerieNumerica_02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,num_copia,num_precopia;
        System.out.println("inserire i numeri");
        num_copia=inp.nextInt();;
        num = inp.nextInt();
        if(num+num_copia!=10){
            do {
            num_precopia=num_copia;
            num_copia=num;
            num = inp.nextInt();
        } while ((num+num_copia!=10)&&(num_precopia!=num));
        }
        
        System.out.println("la somma di due numeri consecutivi che hai inserito è uguale a 10 o il numero inserito è uguale al precedente del precedente");
    }
}
