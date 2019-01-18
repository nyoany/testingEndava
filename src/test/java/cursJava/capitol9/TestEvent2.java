package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

class Fereastra1 extends Frame implements ActionListener {
    Button ok = new Button("Ok");
    Button exit = new Button("Exit");
    int n=0;

public Fereastra1 (String titlu) {
    super(titlu);
    setLayout(new FlowLayout());
    setSize(200, 100);
    add(ok);
    add(exit);

    ok.addActionListener(this);
    exit.addActionListener(this);
    //ambele butoane sunt ascultate in clasa Fereastra
    //deci ascultatorul este instanta curenta: this
}

//metoda interfetei actionlistener

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == exit)
        System.exit(0); //terminam aplicatia
    if (e.getSource() == ok) {
        n ++;
        this.setTitle("Ati apasat OK de " + n + " ori");
        }
    }
}

public class TestEvent2 {
    public static void main (String args[]) {
        Fereastra1 f = new Fereastra1("Test Event");
        f.show();
    }
}
