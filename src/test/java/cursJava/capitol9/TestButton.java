package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;

class Fereastra8 extends Frame implements ActionListener {
    public Fereastra8 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout ( null );
        setSize (200 , 120) ;
        Button b1 = new Button ("OK");
        b1. setBounds (30 , 30, 50, 70);
        b1. setFont ( new Font (" Arial ", Font .BOLD , 14));
        b1. setBackground ( Color . orange );
        add (b1);
        Button b2 = new Button (" Cancel ");
        b2. setBounds (100 , 30, 70, 50);
        b2. setForeground ( Color . blue );
        add (b2);
        b1. addActionListener ( this );
        b2. addActionListener ( this );
    }
    // Metoda interfetei ActionListener
    public void actionPerformed ( ActionEvent e) {
        String command = e. getActionCommand ();
        System . out. println (e);
        if ( command . equals ("OK"))
            setTitle (" Confirmare !");
        else
        if ( command . equals (" Cancel "))
            setTitle (" Anulare !");
    }
}

public class TestButton {
    public static void main (String args[]) {
        Fereastra8 f = new Fereastra8("Button");
        f.show();
    }
}
