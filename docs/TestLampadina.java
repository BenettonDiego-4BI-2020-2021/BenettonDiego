package eser_lampadina;
import java.util.Scanner;

public class TestLampadina {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Lampadina lamp1 = new Lampadina();
        System.out.println("inserire quante volte si vuole cliccare l'interruttore");
        int num = inp.nextInt();
        for (int i = 0; i < num; i++) {
            lamp1.click();
            System.out.println(lamp1.getStato());
        }
    }   
}
