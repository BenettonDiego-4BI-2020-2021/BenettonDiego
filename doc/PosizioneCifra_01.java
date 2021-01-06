package eser_cicli;
import java.util.Scanner;

public class PosizioneCifra_01 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,buffer,controllo=0;
        String numero;
        System.out.println("inserire un numero");
        num= inp.nextInt();
        numero = Integer.toString(num);
        String numeri[] = numero.split("");
        for (int i = 0; i < numeri.length; i++) {
            buffer= Integer.parseInt(numeri[i]);
            if(buffer>=i){
                controllo+=1;
            }
        }
        if(controllo==numeri.length){
            System.out.println("proprietà di posizione rispettata");
        }else{
            System.out.println("proprietà di posizione non rispettata");
        }
    }
}
