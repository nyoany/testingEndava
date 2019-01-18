package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

class Fereastra extends Frame {
    public Fereastra(String titlu) {
        super(titlu);
        setLayout(new FlowLayout());
        setSize(200, 100);
        Button b1 = new Button("Ok");
        Button b2 = new Button("Cancel");
        add(b1);
        add(b2);

        Ascultator listener = new Ascultator(this);
        b1.addActionListener(listener);
        b2.addActionListener(listener);

        //ambele butoane sunt ascultate de obiectul listener.
        //instanta a clasei ascultator definita mai jos
    }
}

class Ascultator implements ActionListener {
    private Fereastra f;
    public Ascultator(Fereastra f) {
        this.f = f;
    }

    //metoda interfetei actionlistener
    public void actionPerformed(ActionEvent e) {
        f.setTitle("Ati apasat " + e.getActionCommand());
    }
}

public class TestEvent1 {
    public static void main (String args[]) {
        Fereastra f = new Fereastra("Test Event");
        f.show();
    }
}