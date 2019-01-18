package cursJava.capitol9;
import java . awt .*;
public class TestLabel {
    public static void main ( String args []) {
        Frame f = new Frame (" Label ");
        Label nord , sud , est , vest , centru ;
        nord = new Label (" Nord ", Label . CENTER );
        nord . setForeground ( Color . blue );
        sud = new Label ("Sud ", Label . CENTER );
        sud . setForeground ( Color .red);
        vest = new Label (" Vest ", Label . LEFT );
        vest . setFont ( new Font (" Dialog ", Font .ITALIC , 14));
        est = new Label ("Est ", Label . RIGHT );
        est . setFont ( new Font (" Dialog ", Font .ITALIC , 14));
        centru = new Label (" Centru ", Label . CENTER );
        centru . setBackground ( Color . yellow );
        centru . setFont ( new Font (" Arial ", Font .BOLD , 20));
        f.add(nord , BorderLayout . NORTH );
        f.add(sud , BorderLayout . SOUTH );
        f.add(est , BorderLayout . EAST );
        f.add(vest , BorderLayout . WEST );
        f.add(centru , BorderLayout . CENTER );
        f. pack ();
        f. show ();
    }
}