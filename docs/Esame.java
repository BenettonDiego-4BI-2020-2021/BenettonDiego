package classe_studente_esame;

public class Esame {
    private Studente stud;
    private String dataesame;
    private String materia;
    private int voto;
    private boolean lode;
    
    public Esame(){
        stud=null;
        dataesame=null;
        materia=null;
        voto=0;
        lode=false;
    }
    public Esame(Studente stud, String dataesame, String materia, int voto, boolean lode){
        this.stud=stud;
        this.dataesame=dataesame;
        this.materia=materia;
        this.voto=voto;
        this.lode=lode;
    }
    public void setEsame(Studente stud, String dataesame, String materia, int voto, boolean lode){
        this.stud=stud;
        this.dataesame=dataesame;
        this.materia=materia;
        this.voto=voto;
        this.lode=lode;
    }
    public void setStud(Studente stud){
        this.stud=stud;
    }
    public void setDataesame(String dataesame){
        this.dataesame=dataesame;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
    public void setVoto(int voto){
        this.voto=voto;
    }
    public void setLode(boolean lode){
        this.lode=lode;
    }
    public Studente getStud(){
        return stud;
    }
    public String getDataesame(){
        return dataesame;
    }
    public int getVoto(){
        return voto;
    }
    public boolean getLode(){
        return lode;
    }
    public String getMateria(){
        return materia;
    }
    @Override
    public String toString(){
        String s;
        s="esame tenuto da "+stud+" della materia "+materia+" in data "+dataesame+" con voto "+voto+"; eventuale lode-> "+lode;
        return s;
    }
    public boolean equals(Esame s){
        return (this.toString().equals(s.toString()));
    }
}
