package cursJava.capitol9;
import sun.plugin2.ipc.windows.WindowsEvent;

import java.awt.*;
import java.awt.event.*;


class Fereastra3 extends Frame implements WindowListener {
    public Fereastra3(String titlu) {
        super(titlu);
        this.addWindowListener(this);
    }

    //Metodele interfetei WindowListener
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        //terminare program
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}

public class TestWindowListener {
    public static void main(String args[]){
        Fereastra3 f = new Fereastra3 ("Test WindowLiestner");
                f.show();
}
}
