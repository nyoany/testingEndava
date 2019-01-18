package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;

class Fereastra7 extends Frame implements ActionListener {
    // Definim meniul popup al ferestrei
    private PopupMenu popup ;
    // Pozitia meniului va fi relativa la fereastra
    private Component origin ;
    public Fereastra7 ( String titlu ) {
        super ( titlu );
        origin = this ;

        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });

        this . addMouseListener (new MouseAdapter () {
            public void mousePressed ( MouseEvent e) {
                if (e. isPopupTrigger ())
                    popup . show (origin , e. getX () , e. getY ());
            }
            public void mouseReleased ( MouseEvent e) {
                if (e. isPopupTrigger ())
                    popup . show (origin , e. getX () , e. getY ());
            }
        });
        setSize (300 , 300) ;

        // Cream meniul popup

        popup = new PopupMenu (" Options ");
        popup .add(new MenuItem ("New"));
        popup .add(new MenuItem (" Edit "));
        popup . addSeparator ();
        popup .add(new MenuItem (" Exit "));
        add ( popup ); // atasam meniul popup ferestrei
        popup . addActionListener ( this );
    }

    public void actionPerformed ( ActionEvent e) {
        String command = e. getActionCommand ();
        if ( command . equals (" Exit "))
            System . exit (0);
    }
}

public class TestPopupMenu {
    public static void main ( String args []) {
        Fereastra7 f = new Fereastra7 (" PopupMenu ");
        f. show ();
    }
}
