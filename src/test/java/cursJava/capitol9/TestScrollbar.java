package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
class Fereastra13 extends Frame implements AdjustmentListener {
    private Scrollbar scroll ;
    private Label valoare ;
    public Fereastra13 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout (new GridLayout (2, 1));
        valoare = new Label ("", Label . CENTER );
        valoare . setBackground ( Color . lightGray );
        scroll = new Scrollbar ( Scrollbar . HORIZONTAL , 0, 1, 0,
                101) ;
        add ( valoare );
        add ( scroll );
        setSize (200 , 80);
        scroll . addAdjustmentListener ( this );
    }
// Metoda interfetei AdjustmentListener
public void adjustmentValueChanged ( AdjustmentEvent e) {
    valoare . setText ( scroll . getValue () + " %");
}
}
public class TestScrollbar {
    public static void main ( String args []) {
        Fereastra13 f = new Fereastra13 (" Scrollbar ");
        f. show ();
    }
}
