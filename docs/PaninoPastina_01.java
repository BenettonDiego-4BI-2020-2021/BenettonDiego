package eser_cicli;

import java.util.Scanner;

public class PaninoPastina_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("quanti soldi ha mario? -> ");
        int giorni = 0, panini = 0, pastine = 0;
        double soldi_mario;
        soldi_mario = inp.nextDouble();
        final double pastina = 1;
        final double panino = 1.5;
        while (soldi_mario > 0) {
            boolean soddisfazione = false;
            while ((soddisfazione == false)&&(soldi_mario>0)) {
                System.out.println("vuoi mangiare oggi? (inserire si o no)");
                String risposta = inp.nextLine();
                if (risposta.equals("si")) {
                    System.out.println("vuoi mangiare un panino o una pastina? (inserire panino o pastina)");
                    String scelta = inp.nextLine();
                    if ((scelta.equals("panino")) && (soldi_mario >= panino)) {
                        soldi_mario -= panino;
                        panini += 1;
                    } else {
                        if((!scelta.equals("pastina"))&&(!scelta.equals("salta"))){
                            System.out.println("non hai soldi per un panino, scegli altro o salta la merenda");
                            System.out.println("vuoi mangiare un panino o una pastina? (inserire pastina o salta)");
                            scelta = inp.nextLine();
                        }  
                    }
                    if ((scelta.equals("pastina")) && (soldi_mario >= pastina)) {
                        soldi_mario -= pastina;
                        pastine += 1;
                    } else {
                        if (!scelta.equals("panino")&&(!scelta.equals("salta"))) {
                            System.out.println("non hai soldi per una pastina, salta la merenda");
                            System.out.println("per saltare la merenda scrivi 'salta'");
                            scelta = inp.nextLine();
                        }
                    }
                    if (scelta.equals("salta")) {

                    }
                } else {
                    System.out.println("a domani allora");
                    soddisfazione = true;
                    giorni += 1;
                }
            }

        }
        System.out.println("mario in " + giorni + " giorni ha mangiato " + panini + " panini e " + pastine + " pastine");
    }

}
