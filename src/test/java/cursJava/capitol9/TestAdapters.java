package cursJava.capitol9;
import java.awt.*;
import java.awt.event.*;

class Fereastra5 extends Frame {
    public Fereastra5 (String titlu) {
        super(titlu);
        setSize(400, 400);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
// Terminam aplicatia
                System.exit(0);
            }
        });

        final Label label = new Label("", Label.CENTER);
        label.setBackground(Color.yellow);
        add(label, BorderLayout.NORTH);

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //desenam un cerc la fiecare click de mouse
                label.setText("Click... ");
                Graphics g = Fereastra5.this.getGraphics();
                g.setColor(Color.blue);
                int raza = (int) (Math.random() * 50);
                g.fillOval(e.getX(), e.getY(), raza, raza);
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                //desenam un punct la coordonatele mouse-ului
                Graphics g = Fereastra5.this.getGraphics();
                g.drawOval(e.getX(), e.getY(), 1, 1);
            }
        });

        this.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                //afisam caracterul tastat
                label.setText("Ati tastat: " + e.getKeyChar() + "");
            }
        });
    }
}

public class TestAdapters {
    public static void main (String args[]) {
        Fereastra5 f = new Fereastra5("Test adaptori");
        f.show();
    }
}
