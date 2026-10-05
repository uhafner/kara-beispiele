package edu.hm.hafner.kara.lecture;

import static de.i8k.karalight.Kara.isOnLeaf;
import static de.i8k.karalight.Kara.isTreeInFront;
import static de.i8k.karalight.Kara.move;
import static de.i8k.karalight.Kara.putLeaf;
import static de.i8k.karalight.Kara.turnLeft;

/**
 * KaraLight: Template für die Übungsaufgaben.
 *
 * @author Ullrich Hafner
 */
class CopyAndPaste {
    /**
     * Die {@code main} Methode ist der Ausgangspunkt für KaraLight. Hier wird direkt in Java programmiert, folgende
     * Kara-Befehle können verwendet werden, um Kara zu steuern:
     *
     * <ul>
     *   <li>{@code move()} - Kara bewegt sich einen Schritt nach vorn. Das geht nur, wenn vor Kara kein Baum ist! Wenn
     *       vor Kara ein Pilz ist, schiebt Kara den Pilz eine Position weiter. (Das setzt wiederum voraus, dass der
     *       Platz vor dem Pilz frei ist).
     *   <li>{@code turnRight()} bzw. {@code turnLeft()} - Kara dreht sich nach rechts bzw. links
     *   <li>{@code pickLeaf()} - Kara nimmt ein Blatt auf (geht nur, wenn eins da ist!)
     *   <li>{@code putLeaf()} - Kara legt ein Blatt ab (geht nur, wenn keins da ist!)
     *   <li>{@code say(...)} - Kara gibt einen Text in einem Fenster aus.
     *   <li>{@code askNumber(...)} - Kara fragt nach einer Zahl, die den Ablauf des Programms variabel gestaltet.
     * </ul>
     *
     * <p>Zusätzlich stehen Ihnen die folgenden Abfragen zur Verfügung:
     *
     * <ul>
     *   <li>{@code isMushroomInFront()} - liefert {@code true}, wenn vor Kara ein Pilz steht
     *   <li>{@code isTreeInFront()} - liefert {@code true}, wenn vor Kara ein Baum steht
     *   <li>{@code isTreeLeft()} - liefert {@code true}, wenn links von Kara ein Baum steht
     *   <li>{@code isTreeRight()} - liefert {@code true}, wenn rechts von Kara ein Baum steht
     *   <li>{@code isOnLeaf()} - liefert {@code true}, wenn Kara auf einem Blatt steht
     * </ul>
     */
    void main() {
        moveToTree();
        boolean wasOnLeaf = isOnLeaf();
        turnLeft();
        turnLeft();
        moveToTree();
        if (wasOnLeaf) {
            putLeaf();
        }
    }

    void moveToTree() {
        while (!isTreeInFront()) {
            move();
        }
    }
}
