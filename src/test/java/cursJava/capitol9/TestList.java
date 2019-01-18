package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
class Fereastra12 extends Frame implements ItemListener {
    private Label label ;
    private List culori ;
    public Fereastra12 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout (new GridLayout (2, 1));
        label = new Label (" Alegeti culoarea ", Label . CENTER );
        label . setBackground ( Color .red);
        culori = new List (3);
        culori . add(" Rosu ");
        culori . add(" Verde ");
        culori . add(" Albastru ");
        culori . select (3);
        add ( label );
        add ( culori );
        setSize (200 , 200) ;
        culori . addItemListener ( this );
    }
//Metoda interfetei ItemListener
    public void itemStateChanged ( ItemEvent e) {
        switch ( culori . getSelectedIndex ()) {
            case 0:
                label . setBackground ( Color .red);
                break ;
            case 1:
                label . setBackground ( Color . green );
                break ;
            case 2:
                label . setBackground ( Color . blue );
        }
    }
}

public class TestList {
    public static void main ( String args []) {
        Fereastra12 f = new Fereastra12 (" List ");
        f. show ();
    }
}