package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
class Fereastra11 extends Frame implements ItemListener {
    private Label label ;
    private Choice culori ;
    public Fereastra11 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout (new GridLayout (4, 1));
        label = new Label (" Alegeti culoarea ");
        label . setBackground ( Color .red);
        culori = new Choice ();
        culori . add(" Rosu ");
        culori . add(" Verde ");
        culori . add(" Albastru ");
        culori . select (" Rosu ");
        add ( label );
        add ( culori );
        setSize (200 , 100) ;
        culori . addItemListener ( this );
    }

    // Metoda interfetei ItemListener
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
public class TestChoice {
    public static void main ( String args []) {
        Fereastra11 f = new Fereastra11 (" Choice ");
        f. show ();
    }
}
