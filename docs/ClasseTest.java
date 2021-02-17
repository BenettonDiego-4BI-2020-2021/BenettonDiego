package classe_studente_esame;

public class ClasseTest {

    public static void main(String[] args) {
        Studente s1 = new Studente();
        Studente s2 = new Studente();
        Esame e1 = new Esame();
        Esame e2 = new Esame();
        s1.setStudente("gino", "alberto", "1212334a", "11/1/2005");
        s2.setStudente("mario", "finato", "12312g", "23/11/2010");
       e1.setEsame(s1,"28/11/2019","Lettere", 8, false);
       e2.setEsame(s2,"14/8/2015","Lettere", 10, true);
       
    }
}
