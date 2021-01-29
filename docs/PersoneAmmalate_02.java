package eser_cicli;

public class PersoneAmmalate_02 {
    
    public static void main(String[] args) {
        int ammalati=1000,giorni=0;
        double guariti_percentuale=20;
        while(ammalati>100){
            double guariti_numero=((double)ammalati/100)*guariti_percentuale;
            ammalati-=guariti_numero;
            giorni+=1;
        }
        System.out.println("ci sono voluti "+giorni+" giorni affinché il numero di ammalati fosse minore di 100");
    }
}
