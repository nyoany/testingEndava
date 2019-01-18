package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

class Fereastra6 extends Frame implements ActionListener {
    //constructorul
    public Fereastra6 (String titlu) {
        super(titlu);

        //tratam evenimentul de inchidere a ferestrei
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); //inchidem fereastra
                //sau terminam aplicatia
                System.exit(0);
            }
        });
        //eventual schimbal gestionarul de pozitionare
        setLayout(new FlowLayout());

        //adaugam componentele pe suprafata ferestrei

        Button exit = new Button("Exit");
        add(exit);

        //facem inregistrarea claselor listener
        exit.addActionListener(this);

        //stabilim dimensiunile
        pack(); //implicit

        //sau explicit
        // setSize(200, 200);
    }
    //implementam metodele interfetelor de tip listener
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}


public class TestFrame {
    public static void main(String args[]) {
        //creem fereastra
        Fereastra6 f = new Fereastra6("O fereastra");
        //o facem vizibila
        f.show();
    }
}
