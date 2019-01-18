package cursJava.capitol9;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

//Fereastra principala

class FerPrinc extends Frame implements ActionListener {
    public FerPrinc (String titlu) {
        super(titlu);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setSize(300,80);
        Button b = new Button("Schimb titlul");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        FerDialog d = new FerDialog(this, "Dati titlul", true);
        String titlu = d.raspuns;
        if (titlu == null)
            return;
        setTitle(titlu);
    }
}

//Fereastra de dialog

class FerDialog extends Dialog implements ActionListener {
    public String raspuns = null;
    private TextField text;
    private Button ok, cancel;

    public FerDialog (Frame parinte, String titlu, boolean modala) {
        super(parinte, titlu, modala);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               raspuns = null;
               dispose();
            }
        });

        text = new TextField("", 30);
        add(text, BorderLayout.CENTER);

        Panel panel = new Panel();
        ok = new Button("OK");
        cancel = new Button("Cancel");
        panel.add(ok);
        panel.add(cancel);

        add(panel, BorderLayout.SOUTH);
        pack();

        text.addActionListener(this);
        ok.addActionListener(this);
        cancel.addActionListener(this);

        show();
    }

    public void actionPerformed(ActionEvent e) {
        Object sursa = e.getSource();
        if (sursa == ok || sursa == text)
            raspuns = text.getText();
        else
            raspuns = null;
        dispose();
    }
}

//Clasa Principala
public class TestDialog {
    public static void main(String args[]) {
        FerPrinc f = new FerPrinc("Fereastra Principala");
        f.show();
    }
}
