package classe_studente_esame;

public class Studente {

    private String nome;
    private String cognome;
    private String matricola;
    private String nascita;

    public Studente() {
        nome = null;
        cognome = null;
        matricola = null;
        nascita = null;
    }

    public Studente(String nome, String cognome, String matricola, String nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.nascita = nascita;
    }

    public void setStudente(String nome, String cognome, String matricola, String nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.nascita = nascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getMatricola(){
        return matricola;
    }
    public String getNascita(){
        return nascita;
    }
    @Override
    public String toString(){
        String s;
        s="studente "+nome+" "+cognome+" "+matricola+" "+nascita;
        return s;
    }
    public boolean equals(Studente s){
        return (this.toString().equals(s.toString()));
    }   
}
