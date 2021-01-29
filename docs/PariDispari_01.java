package eser_cicli;
import java.util.Scanner;

public class PariDispari_01 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,pari=0,dispari=0,buffer;
        String numero;
        System.out.println("inserire un numero");
        num= inp.nextInt();
        numero = Integer.toString(num);
        String numeri[] = numero.split("");
        for (int i = 0; i < numeri.length; i++) {
            buffer= Integer.parseInt(numeri[i]);
            if(buffer%2==0){
                pari+=1;
            }else{
                dispari+=1;
            }
        }
        System.out.println("il numero inserito contiene "+pari+" numeri pari e "+dispari+" numeri dispari");
    }
}
