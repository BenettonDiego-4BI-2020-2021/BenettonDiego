package eser_cicli;
import java.util.Scanner;

public class SerieNumeri_01 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cont_numeri_ins=0;
        int numero,numero_precedente;
        System.out.println("inserire un numero");
        numero = inp.nextInt();
        numero_precedente=numero; 
        while(numero>=numero_precedente){
            numero_precedente=numero;
            System.out.println("inserire un numero");
            numero = inp.nextInt();
            cont_numeri_ins+=1;
        }
        System.out.println("hai inserito "+cont_numeri_ins+" numeri prima di inserire un numero che ha impedito la crescita");
    }
}
