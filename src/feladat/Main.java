package feladat;

import modell.Tabla;

public class Main {

    public static void main(String[] args) {

        Tabla t = new Tabla();

        System.out.println(t.tabla());
        t.elhelyez(8);
        System.out.println(t.tabla());
        int ures_sorok_szama = 0;
        int ures_oszlopok_szama = 0;
        for (int i = 0; i < 8; i++) {
            if (t.uresSor(i)) {
                ures_sorok_szama++;
            }
            if (t.uresOszlop(i)) {
                ures_oszlopok_szama++;
            }
        }
        System.out.println("Oszlopok száma: " +ures_oszlopok_szama);
        System.out.println( "Sorok száma: " + ures_sorok_szama);

    }

}
