package cursJava.capitol9;

import java . awt .*;
public class TestBorderLayout {
    public static void main ( String args []) {
        Frame f = new Frame (" Border Layout ");
// Apelul de mai jos poate sa lipseasca
        f. setLayout (new BorderLayout ());
        f.add(new Button (" Nord "), BorderLayout . NORTH );
        f.add(new Button (" Sud"), BorderLayout . SOUTH );
        f.add(new Button (" Est"), BorderLayout . EAST );
        f.add(new Button (" Vest "), BorderLayout . WEST );
        f.add(new Button (" Centru "), BorderLayout . CENTER );
        f. pack ();
        f. show ();
    }
}

