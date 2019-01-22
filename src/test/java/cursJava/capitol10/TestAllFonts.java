package cursJava.capitol10;

//afiseaza toate fonturile disponibile

import java . awt .*;
class Fonturi extends Canvas {
    private Font [] fonturi ;
    Dimension canvasSize = new Dimension (400 , 400) ;
    public Fonturi () {
        fonturi = GraphicsEnvironment .
                getLocalGraphicsEnvironment (). getAllFonts ();
        canvasSize . height = (1 + fonturi . length ) * 20;
    }
    public void paint ( Graphics g) {
        String nume ;
        for (int i=0; i < fonturi . length ; i ++) {
            nume = fonturi [i]. getFontName ();
            g. setFont (new Font (nume , Font .PLAIN , 14));
            g. drawString (i + ". " + nume , 20, (i + 1) * 20);
        }
    }
    public Dimension getPreferredSize () {
        return canvasSize ;
    }
}
class Fereastra2 extends Frame {
    public Fereastra2 ( String titlu ) {
        super ( titlu );
        ScrollPane sp = new ScrollPane ();
        sp. setSize (400 , 400) ;
        sp. add( new Fonturi ());
        add (sp , BorderLayout . CENTER );
        pack ();
    }
}
public class TestAllFonts {
    public static void main ( String args []) {
        new Fereastra2 ("All fonts "). show ();
    }
}