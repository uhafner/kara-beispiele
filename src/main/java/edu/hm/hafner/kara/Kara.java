package edu.hm.hafner.kara;

public class Kara {
    // Eigenschaften
    int anzahlPunkte = 13;
    int anzahlBeine = 6;
    int x;
    int y;
    int richtung = 0; // Kommt noch nächstes Jahr (0 = rechts, 1 = runter, ...)
    // Konstruktoren (zum Initialisieren von Eigenschaften)

    Kara() {
        this(0, 0);
    }

    Kara(final int xStart, final int yStart) {
        x = xStart;
        y = yStart;
    }
    // Methoden

    public int getX() {
        return x;
    }

    void move() {
        if (richtung == 0) {
            x++;
        }
        if (richtung == 1) {
            y++;
        }
        if (richtung == 2) {
            x--;
        }
        if (richtung == 3) {
            y--;
        }
    }

    public static void main(final String[] args) {
        var kara = new Kara(3, 6);
        System.out.println(kara.getX());
        var linksOben = new Kara();
        System.out.println(linksOben.getX());
    }
}
