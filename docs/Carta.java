package cartedagioco;

public class Carta {

    private String seme;
    private String valore;

    public Carta() {
        seme = null;
        valore = null;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public String getSeme() {
        return seme;
    }

    public String getValore() {
        return valore;
    }

    @Override
    public String toString() {
        String s;
        s = "seme -> " + seme + " valore -> " + valore;
        return s;
    }

    public boolean equals(Carta p) {
        return (this.toString().equals(p.toString()));
    }

    public int calcolaPunteggio() {
        String val = getValore();
        int ris = 0;
        if ((val.equals("K")) || (val.equals("Q")) || (val.equals("J"))) {
            ris = 10;
        } else {
            if (val.equals("*")) {
                ris = 25;
            } else {
                ris = Integer.parseInt(val);
            }
        }
        return ris;
    }

    public Carta vince(Carta c) {
        int val1, val2;
        val1 = this.calcolaPunteggio();
        val2 = c.calcolaPunteggio();
        if (val1 == val2) {
            String seme1, seme2;
            seme1 = this.getSeme();
            seme2 = c.getSeme();
            char a = seme1.charAt(0);
            char b = seme2.charAt(0);
            if (a < b) {
                return this;
            } else {
                return c;
            }
        } else {
            if (val1 > val2) {
                return this;
            } else {
                return c;
            }
        }

    }

    public Carta fondi(Carta o) {
        Carta sos = new Carta();
        if (o.calcolaPunteggio() != 25) {
            sos.setSeme(this.getSeme());
            sos.setValore(o.getValore());
            return sos;
        } else {
            return o;
        }
    }
}
