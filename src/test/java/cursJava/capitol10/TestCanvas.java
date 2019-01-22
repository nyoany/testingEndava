//afiseaza un cerc in mijlocului unui dreptunghi si schimba culoarea la fiecare click

package cursJava.capitol10;
import java.awt.*;
import java.awt.event.*;

class Plansa extends Canvas {
    Dimension dim = new Dimension(100,100);
    private Color color[] = {Color.red, Color.blue};
    private int index = 0;

    public Plansa() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                index = 1 - index;
                repaint();
            }
        });
    }

    public void paint (Graphics g) {
        g.setColor(color[index]);
        g.drawRect(0, 0, dim.width, dim.height);
        g.setColor(color[1 - index]);
        g.fillOval(0, 0, dim.width, dim.height);
    }

    public Dimension getPreferredSize() {
        return dim;
    }
}

class Fereastra1 extends Frame {
    public Fereastra1 (String titlu) {
        super(titlu);
        setSize(400, 400);
        add(new Plansa(), BorderLayout.CENTER);
    }
}

public class TestCanvas {
    public static void main (String args[]) {
        new Fereastra1("Text Canvas").show();
    }
}
