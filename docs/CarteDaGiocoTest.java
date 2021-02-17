package cartedagioco;

public class CarteDaGiocoTest {

    public static void main(String[] args) {
        Carta q = new Carta();
        Carta s = new Carta();
        Carta w = new Carta();
        q.setSeme("cuori");
        q.setValore("J");
        s.setSeme("picche");
        s.setValore("J");
        w.setSeme("quadri");
        w.setValore("4");
        System.out.println(q);
        System.out.println(q.equals(s));
        System.out.println(q.calcolaPunteggio());
        System.out.println(s.calcolaPunteggio());
        System.out.println(w.calcolaPunteggio());
        System.out.println(q.vince(s));
        System.out.println(q.fondi(w));
    }

}
