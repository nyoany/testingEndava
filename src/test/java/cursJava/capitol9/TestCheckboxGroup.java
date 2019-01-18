package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
class Fereastra10 extends Frame implements ItemListener {
    private Label label1 , label2 ;
    private Checkbox cbx1 , cbx2 , cbx3 ;
    private CheckboxGroup cbg ;
    public Fereastra10 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setLayout (new GridLayout (5, 1));
        label1 = new Label (" Alegeti postul TV", Label . CENTER );
        label1 . setBackground ( Color . orange );
        label2 = new Label ("", Label . CENTER );
        label2 . setBackground ( Color . lightGray );
        cbg = new CheckboxGroup ();
        cbx1 = new Checkbox ("HBO", cbg , false );
        cbx2 = new Checkbox (" Discovery ", cbg , false );
        cbx3 = new Checkbox ("MTV", cbg , false );
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
        Checkbox cbx = cbg. getSelectedCheckbox ();
        if (cbx != null )
            label2 . setText (cbx. getLabel ());
    }
}

public class TestCheckboxGroup {
    public static void main ( String args []) {
        Fereastra10 f = new Fereastra10 (" CheckboxGroup ");
        f. show ();
    }
}
