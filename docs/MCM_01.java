package eser_cicli;

import java.util.Scanner;

public class MCM_01 {
    
    public static void main(String[] args) {
        int resto,primo_n,primo_copia,secondo_n,secondo_copia,mcm;
        Scanner inp = new Scanner(System.in);
        System.out.println("inserire il primo numero");
        primo_n= inp.nextInt();
        primo_copia=primo_n;
        System.out.println("inserire secondo numero");
        secondo_n=inp.nextInt();
        secondo_copia=secondo_n;
        
        while(secondo_n != 0){
         resto = primo_n % secondo_n;
         primo_n = secondo_n; 
         secondo_n = resto;
        }
        mcm=(primo_copia*secondo_copia)/primo_n;
        System.out.println("il minimo comune multiplo è-> "+mcm);
    }
}
