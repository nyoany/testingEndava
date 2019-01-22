package cursJava.capitol10;
import java .io .*;
import java . awt .*;
import java . awt. event .*;
import java . awt. print .*;

class Plansa2 extends Canvas implements Printable {
    Dimension d = new Dimension(400, 400);
    public Dimension getPreferredSize() {
        return d;
    }

    public void paint (Graphics g) {
        g.drawRect(200, 200, 100, 100);
        g.drawOval(200, 200, 100, 100);
        g.drawString("Hello", 200, 200);
    }

    public int print(Graphics g, PageFormat pf, int pi)
        throws PrinterException {
        if (pi >= 1)
            return Printable.NO_SUCH_PAGE;

        paint(g);
        g.drawString("Numai la imprimanta", 200, 300);

        return Printable.PAGE_EXISTS;
    }
}

class Fereastra5 extends Frame implements ActionListener {
    private Plansa2 plansa2 = new Plansa2();
    private Button print = new Button("Print");

    public Fereastra5 (String titlu) {
        super(titlu);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(plansa2, BorderLayout.CENTER);

        Panel south = new Panel();
        south.setLayout(new FlowLayout(FlowLayout.CENTER));
        south.add(print);
        add(south, BorderLayout.SOUTH);

        print.addActionListener(this);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        //1. crearea unei sesiuni de tiparire
        PrinterJob printJob = PrinterJob.getPrinterJob();

        //2. Stabilirea obiectului ce va fi printat
        printJob.setPrintable(plansa2);

        //3 initierea dialogului cu utilizatorul
        if (printJob.printDialog()) {
            try {
                //4.tiparirea efectiva
                printJob.print();
            } catch (PrinterException ex) {
                System.out.println("Exceptie la tiparire!");
                ex.printStackTrace();
            }
        }
    }
}

public class TestPrint {
    public static void main (String args[]) throws Exception {
        Fereastra5 f= new Fereastra5("Test print");
                f.show();
    }
}
