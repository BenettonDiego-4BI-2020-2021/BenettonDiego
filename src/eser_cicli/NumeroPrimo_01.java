package eser_cicli;

import java.util.Scanner;

public class NumeroPrimo_01 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,divisore=2,fattori=0,num_copia;
        System.out.println("inserire il numero da controllare");
        num= inp.nextInt();
        num_copia=num;
        while(num!=1){
            while(num%divisore!=0){
                divisore+=1;
            }
            fattori+=divisore;
            num/=divisore;
        }
        if(fattori==num_copia){
            System.out.println("è primo");
        }else{
            System.out.println("non è primo");
        }
    }
}
