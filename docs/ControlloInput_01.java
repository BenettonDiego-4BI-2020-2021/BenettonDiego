package eser_cicli;
import java.util.Scanner;

public class ControlloInput_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        do{
            System.out.println("inserire un numero naturale (0 per far finire gli inserimenti)");
            num= inp.nextInt();
            if(num<0){
                System.out.println("inserito numero negativo, per favore inserire di nuovo il numero");
                num= inp.nextInt();
            }
        }while(num!=0);
    }
}
