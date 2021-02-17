package codicefiscale;

//non ci sono controlli all'interno del programma. esattamente come nelle verifiche si presuppone che l'input sia sempre corretto
import java.util.Scanner;

public class Codicefiscale {

    public static String cognomeMetodo(String cognome) {
        String cognome_fin = "";
        for (int i = 0; i < cognome.length(); i++) {
            char c = cognome.charAt(i);
            if ((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') && (cognome_fin.length() < 3)) {
                cognome_fin += c;
            }
        }
        if (cognome_fin.length() < 3) {
            for (int i = 0; i < cognome.length(); i++) {
                char c = cognome.charAt(i);
                if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && (cognome_fin.length() < 3)) {
                    cognome_fin += c;
                }

            }
        }
        if (cognome_fin.length() < 3) {
            cognome_fin += 'x';
        }

        return cognome_fin;
    }

    public static String nomeMetodo(String nome) {
        String nome_fin = "", nome_con = "";
        int cont_n = 0;

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
            if ((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') && (nome_fin.length() < 3)) {
                nome_con += c;
            }
        }
        if (nome_con.length() < 4) {
            for (int i = 0; i < nome.length(); i++) {
                char c = nome.charAt(i);
                if ((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') && (nome_fin.length() < 3)) {
                    nome_fin += c;
                }
            }
            if (nome_fin.length() < 3) {
                for (int i = 0; i < nome.length(); i++) {
                    char c = nome.charAt(i);
                    if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && (nome_fin.length() < 3)) {
                        nome_fin += c;
                    }

                }
            }
            if (nome_fin.length() < 3) {
                nome_fin += 'x';
            }
        } else {
            for (int i = 0; i < nome.length(); i++) {
                char c = nome.charAt(i);
                if ((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') && (nome_fin.length() < 3)) {
                    cont_n += 1;
                    if (cont_n != 2) {
                        nome_fin += c;
                    }
                }
            }
            if (nome_fin.length() < 3) {
                for (int i = 0; i < nome.length(); i++) {
                    char c = nome.charAt(i);
                    if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && (nome_fin.length() < 3)) {
                        nome_fin += c;
                    }

                }
            }
            if (nome_fin.length() < 3) {
                nome_fin += 'x';
            }

        }
        return nome_fin;
    }

    public static String annoMetodo(String mese, String anno) {
        String anno_fin = "";
        char mese_v[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n'};
        String mese_v2[] = {"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"};

        anno_fin += anno.charAt(anno.length() - 2);
        anno_fin += anno.charAt(anno.length() - 1);

        for (int i = 0; i < 12; i++) {
            if (mese.equals(mese_v2[i])) {
                anno_fin += mese_v[i];
            }
        }
        return anno_fin;
    }

    public static String genderMetodo(String gender, String giorno) {
        String gender_fin = "", giorno3 = "";
        int giorno2;
        giorno2 = Integer.parseInt(giorno);

        if (gender.equals('f')) {
            giorno2 += 40;
        }
        if (giorno2 < 10) {
            giorno3 = Integer.toString(giorno2);
            gender_fin += '0' + giorno3;

        } else {
            giorno3 = Integer.toString(giorno2);
            gender_fin += giorno3;
        }

        return gender_fin;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String nome, cognome, anno, gender, giorno, comune, mese, codicefiscale;
        String cognome_cod, nome_cod, anno_cod, gender_cod, comune_cod;
        System.out.println("inserire il nome --> ");
        nome = inp.nextLine();

        System.out.println("inserire il cognome --> ");
        cognome = inp.nextLine();

        System.out.println("inserire il giorno di nascita --> ");
        giorno = inp.nextLine();
        System.out.println("inserire il mese di nascita --> ");
        mese = inp.nextLine();
        System.out.println("inserire l'anno di nascita --> ");
        anno = inp.nextLine();

        System.out.println("inserire il sesso (f o m) --> ");
        gender = inp.nextLine();

        System.out.println("inserire il codice catastale del comune di nascita --> ");
        comune = inp.nextLine();
        cognome_cod = cognomeMetodo(cognome);
        nome_cod = nomeMetodo(nome);
        anno_cod = annoMetodo(mese, anno);
        gender_cod = genderMetodo(gender, giorno);

        codicefiscale = cognome_cod + nome_cod + anno_cod + gender_cod + comune;
        codicefiscale = codicefiscale.toUpperCase();

        System.out.println(codicefiscale);
    }

}
