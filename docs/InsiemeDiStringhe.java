package eser_stringhe;

public class InsiemeDiStringhe {

    private int len;
    private String[] vett;
    private static int j = 0;

    public InsiemeDiStringhe() {
        len = 10;
        vett = new String[len];
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setVett(String vett[]) {
        this.vett = vett;
    }

    public int getLen() {
        return len;
    }

    public String[] getVett() {
        return vett;
    }

    private void setLenDoppio() {
        this.len = len * 2;
    }

    private void setVettDoppio() {
        setLenDoppio();
        String[] vett2 = new String[len];
        for (int i = 0; i < vett.length; i++) {
            vett2[i] = vett[i];
        }
        vett = vett2;
    }

    public String addElemento(String el) {
        for (int i = 0; i < len && vett[i] != null; i++) {
            if (vett[i].equals(el)) {
                return null;
            }
        }
        if (j == len - 1) {
            setVettDoppio();
            vett[j] = el;
            j++;
            return el;
        } else {
            vett[j] = el;
            j++;
            return el;
        }
    }

    public String stringaPiùLunga() {
        String s = vett[0];
        for (int i = 1; i < len && vett[i] != null; i++) {
            if (s.compareTo(vett[i]) < 0) {
                s = vett[i];
            }
        }
        return s;
    }

    public String stringaConPiùSpazi() {
        String s = "";
        String[] vett2 = new String[len];
        vett2 = vett;
        int nspaz = 0, nspazmax = 0;
        for (int i = 0; i < len && vett2[i] != null; i++) {
            for (int k = 0; k < vett2[i].length(); k++) {
                if (vett2[i].charAt(k) == ' ') {
                    nspaz += 1;
                }
                if (nspaz > nspazmax) {
                    nspazmax = nspaz;
                    s = vett2[i];
                }
            }
        }
        return s;
    }

    public String preString(String pre) {
        String s = "", tot = "";
        int lungh = pre.length();
        for (int i = 0; i < len && vett[i] != null; i++) {
            s = vett[i].substring(0, lungh);
            if (s.compareTo(pre) == 0) {
                tot += vett[i] + " ";
            }
        }
        return tot;
    }

    public boolean equals(InsiemeDiStringhe s) {
        return (this.toString().equals(s.toString()));
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < len && vett[i] != null; i++) {
            s += vett[i] + " ";
        }
        return s;
    }
}
