package eser_cicli;

import java.util.Scanner;

public class LavandinoOtturato_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int acqua_presente,capacità,perdita,scolo;
        System.out.println("quanta acqua c'è nel lavandino?");
        acqua_presente= inp.nextInt();
        System.out.println("quanta acqua è in grado di contenere il lavandino?");
        capacità= inp.nextInt();
        System.out.println("quanta acqua perde il rubinetto");
        perdita= inp.nextInt();
        System.out.println("quanta acqua scola il lavandino?");
        scolo= inp.nextInt();
        for (int i = 1; (i < 21) &&(acqua_presente>0)&&(acqua_presente<capacità); i++) {
            if(i%3==0){
                acqua_presente+=perdita;
            }
            acqua_presente-=scolo;
            System.out.println("il lavandino contiene "+acqua_presente+"cl di acqua al secondo "+i);
        }
    }
}
