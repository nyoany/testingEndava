package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
class Fereastra9 extends Frame implements ItemListener {
    private Label label1 , label2 ;
    private Checkbox cbx1 , cbx2 , cbx3 ;
    public Fereastra9 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout (new GridLayout (5, 1));
        label1 = new Label (" Ingrediente Pizza :", Label . CENTER );
        label1 . setBackground ( Color . orange );
        label2 = new Label ("");
        label2 . setBackground ( Color . lightGray );
        cbx1 = new Checkbox (" cascaval ");
        cbx2 = new Checkbox (" sunca ");
        cbx3 = new Checkbox (" ardei ");
        add ( label1 );
        add ( label2 );
        add ( cbx1 );
        add ( cbx2 );
        add ( cbx3 );
        setSize (200 , 200) ;
        cbx1 . addItemListener ( this );
        cbx2 . addItemListener ( this );
        cbx3 . addItemListener ( this );
    }
    // Metoda interfetei ItemListener
    public void itemStateChanged ( ItemEvent e) {
        StringBuffer ingrediente = new StringBuffer ();
        if ( cbx1 . getState () == true )
            ingrediente . append (" cascaval ");
        if ( cbx2 . getState () == true )
            ingrediente . append (" sunca ");
        if ( cbx3 . getState () == true )
            ingrediente . append (" ardei ");
        label2 . setText ( ingrediente . toString ());
    }
}

public class TestCheckbox {
    public static void main ( String args []) {
        Fereastra9 f = new Fereastra9 (" Checkbox ");
        f. show ();
    }
}
