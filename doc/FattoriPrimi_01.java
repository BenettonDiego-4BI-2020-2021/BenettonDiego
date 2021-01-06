package eser_cicli;
import java.util.Scanner;

public class FattoriPrimi_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,divisore=2;
        String fattori="";
        System.out.println("inserire il numero da fattorizzare");
        num= inp.nextInt();
        while(num!=1){
            while(num%divisore!=0){
                divisore+=1;
            }
            fattori+=divisore+" ";
            num/=divisore;
        }
        System.out.println(fattori);
    }
}
