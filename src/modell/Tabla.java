package modell;

import java.util.Random;

public class Tabla {

    int uresOszlopokSzama, uresSorokSzama;

    private char[][] t;
    private char uresCella;

    public Tabla() {
        char[][] t = new char[8][8];
        uresCella = '#';
        this.t = t;
        for (int i = 0; i < this.t.length; i++) {
            for (int j = 0; j < this.t.length; j++) {
                this.t[i][j] = uresCella;
            }
        }
    }

    public boolean uresSor(int sor) {
        for (int i = 0; i < t.length; i++) {
            if (t[i][sor] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean uresOszlop(int oszlop) {
        for (int i = 0; i < t.length; i++) {
            if (t[oszlop][i] == 'K') {
                return false;
            }
        }
        return true;

    }

    public void elhelyez(int n) {
        int max = 0, min = 7;
        char kiralyno = 'K';
        while (n != 0) {
            int randomSor = min + (int) (Math.random() * ((max - min) + 1));
            int randomOszlop = min + (int) (Math.random() * ((max - min) + 1));
            if (this.t[randomSor][randomOszlop] != kiralyno) {
                this.t[randomSor][randomOszlop] = kiralyno;
                n = n - 1;
            }
        }
    }

    public String tabla() {
        String tabla = "";
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                tabla += t[i][j];
            }
            tabla += "\n";
        }
        return tabla;
    }

    public void megjelenit() {
        System.out.println(tabla());

    }

}
