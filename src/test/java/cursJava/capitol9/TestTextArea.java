package cursJava.capitol9;
import java . awt .*;
import java . awt. event .*;
import java .io .*;
class Fereastra16 extends Frame implements TextListener ,
        ActionListener {
    private TextArea text ;
    private TextField nume ;
    private Button salvare ;
    public Fereastra16 ( String titlu ) {
        super ( titlu );
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setBackground ( Color . lightGray );
        text = new TextArea ("", 30, 10, TextArea .
                SCROLLBARS_VERTICAL_ONLY );
        nume = new TextField ("", 12) ;
        salvare = new Button (" Salveaza text ");
        salvare . setEnabled ( false );
        Panel fisier = new Panel ();
        fisier . add( new Label (" Fisier :"));
        fisier . add( nume );
        add (fisier , BorderLayout . NORTH );
        add (text , BorderLayout . CENTER );
        add ( salvare , BorderLayout . SOUTH );
        setSize (300 , 200) ;
        text . addTextListener ( this );
        salvare . addActionListener ( this );
    }
    // Metoda interfetei TextListener
    public void textValueChanged ( TextEvent e) {
        if ( text . getText (). length () == 0 ||
                nume . getText (). length () == 0)
            salvare . setEnabled ( false );
        else
            salvare . setEnabled ( true );
    }
    // Metoda interfetei ActionListener
    public void actionPerformed ( ActionEvent e) {
        String continut = text . getText ();
        try {
            PrintWriter out = new PrintWriter (
                    new FileWriter ( nume . getText ()));
            out . print ( continut );
            out . close ();
            text . requestFocus ();
        } catch ( IOException ex) {
            ex. printStackTrace ();
        }
    }
}
public class TestTextArea {
    public static void main ( String args []) {
        Fereastra16 f = new Fereastra16 (" TextArea ");
        f. show ();
    }
}