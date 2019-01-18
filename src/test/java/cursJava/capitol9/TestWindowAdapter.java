package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

class Fereastra4 extends Frame {
    public Fereastra4 (String titlu) {
        super(titlu);
        this.addWindowListener(new Ascultator2());
    }
}

class Ascultator2 extends WindowAdapter {
    //supradefinim metodele care ne intereseaza
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class TestWindowAdapter {
    public static void main (String args[]) {
        Fereastra4 f = new Fereastra4("Test windowAdapter");
        f.show();
    }
}
