package cursJava.capitol10;

import java .io .*;
import java . awt .*;

class TestPrintText {
    public static void main ( String args []) throws Exception {
// pentru Windows
        PrintWriter imp = new PrintWriter ( new FileWriter (" lpt1 "))
                ;
// pentru UNIX
// PrintWriter imp = new PrintWriter (new FileWriter ("/ dev/lp "));
        imp . println (" Test imprimanta ");
        imp . println (" ABCDE ");
        imp . close ();
    }
}
