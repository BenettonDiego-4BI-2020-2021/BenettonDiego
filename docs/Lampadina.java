package eser_lampadina;

public class Lampadina {

    private String stato;
    private int click;

    public Lampadina() {
        stato = "spenta";
        click = 0;
    }

    public Lampadina(int click) {
        this.click = click;
    }

    public void setClick(int click) {
        this.click = click;
        if (this.click > 10) {
            stato = "rotta";
        } else {
            if (this.click % 2 != 0) {
                stato = "accesa";
            } else {
                stato = "spenta";
            }
        }
    }

    public String getStato() {
        return stato;
    }

    public int getClick() {
        return click;
    }

    public boolean equals(Lampadina l) {
        return (this.toString().equals(l.toString()));
    }

    @Override
    public String toString() {
        String s;
        s = "la lampadina al click " + click + " è " + stato;
        return s;
    }

    public void click() {
        click += 1;
        if (click > 10) {
            stato = "rotta";
        } else {
            if (click % 2 != 0) {
                stato = "accesa";
            } else {
                stato = "spenta";
            }
        }
    }
}
