package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class FerPrinc2 extends Frame implements ActionListener {
    public FerPrinc2 (String titlu) {
        super(titlu);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button b = new Button("Alege fisier");
        add(b, BorderLayout.CENTER);
        pack();

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        FileDialog fd = new FileDialog(this, "Alegeti un fisier", FileDialog.LOAD);
        //stabilim directorul curent
        fd.setDirectory(".");

        //stabilim numele implicit
        fd.setFile("TestFileDialog.java");

        //specificam filtrul
        fd.setFilenameFilter(new FilenameFilter() {
            public boolean accept(File dir, String numeFis) {
                return (numeFis.endsWith(".java"));
            }
        });
        //afisam fereastra de dialog (modala)
        fd.show();

        System.out.println("Fisierul ales este: " + fd.getFile());
    }
}

public class TestFileDialog {
    public static void main(String args[]) {
        FerPrinc2 f = new FerPrinc2("Fereastra principala");
        f.show();
    }
}
