package eser_stringhe;

import java.util.Scanner;

public class StringheTest {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        InsiemeDiStringhe vett = new InsiemeDiStringhe();
        for (int i = 0; i < 3; i++) {
            String gino = inp.nextLine();
            vett.addElemento(gino);
        }
        System.out.println(vett);
        System.out.println(vett.stringaPiùLunga());
        System.out.println(vett.stringaConPiùSpazi());
        System.out.println(vett.preString("ci"));
    }
}
